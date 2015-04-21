package com.hanshesse.evoucher.Api

import akka.actor.Actor
import spray.http.MediaTypes._
import spray.routing.HttpService
import scala.slick.driver.MySQLDriver.simple._
import scala.slick.jdbc.meta.MTable
import com.hanshesse.evoucher.config.Configuration
import com.hanshesse.evoucher.dao.VoucherDAO.vouchers


/**
 * Entry point for the Voucher API
 *
 */
class VoucherApiActor extends Actor with ApiService {
  def actorRefFactory = context

  def receive = runRoute(route)
}

/**
 * Specifies the routing for the Voucher API
 */
trait ApiService extends HttpService with Configuration {
  val route = {
    path("") {
      get {
        respondWithMediaType(`text/html`) {
          complete {
            val db = Database.forURL(url = "jdbc:mysql://%s:%d/%s".format(dbHost, dbPort, dbName),
              user = dbUser, password = dbPassword, driver = "com.mysql.jdbc.Driver")
            val query = for (v <- vouchers) yield (v.serial, v.PIN)
            val result = db.withSession {
              session =>
                query.list(session)
            }

            result.take(1).toString()
          }
        }
      }
    }
  }
}
