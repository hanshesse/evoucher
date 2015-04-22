package com.hanshesse.evoucher.Api


import spray.routing.HttpService
import spray.http.MediaTypes._
import scala.slick.driver.MySQLDriver.simple._
import com.hanshesse.evoucher.dao.VoucherDAO.vouchers


/**
 * Created by Hans Hesse on 22/04/15.
 */
trait VoucherServiceApi extends HttpService {
  val voucherServiceApiRoute = {
    path("vouchers") {
      get {
        respondWithMediaType(`text/html`) {
          complete {
            /*
            val db = Database.forURL(url = "jdbc:mysql://%s:%d/%s".format(dbHost, dbPort, dbName),
              user = dbUser, password = dbPassword, driver = "com.mysql.jdbc.Driver")
            val query = for (v <- vouchers) yield (v.serial, v.PIN)
            val result = db.withSession {
              session =>
                query.list(session)
            }

            result.take(1).toString()
            */
            "Hello, world!"
          }
        }
      }
    }
  }
}
