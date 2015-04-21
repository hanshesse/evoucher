package com.hanshesse.evoucher.workflow

import akka.actor.Actor
import akka.event.Logging


class VoucherManager extends Actor {
  val log = Logging(context.system, this)

  def receive = {
    case "test" => log.info("received test")
    case _      => log.info("received unknown message")
  }
}

object VoucherManager {

}