/**
 * Created by Hans Hesse on 2015/02/22.
 */

package com.hanshesse.evoucher.boot

import akka.actor.{Props, ActorSystem}
import akka.io.IO
import spray.can.Http
import com.hanshesse.evoucher.config.Configuration
import com.hanshesse.evoucher.Api.VoucherApiActor


object Platform extends App with Configuration {
  // create an actor system for application
  implicit val system = ActorSystem("evoucher")

  // create and start rest service actor
  val restService = system.actorOf(Props[VoucherApiActor], "evoucher-api")

  // start HTTP server with rest service actor as a handler
  IO(Http) ! Http.Bind(restService, serviceHost, servicePort)
}
