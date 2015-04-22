package com.hanshesse.evoucher.Api

import akka.actor.Actor
import spray.routing.HttpService

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
trait ApiService extends HttpService
  with VoucherServiceApi
  with ProjectServiceApi
  with RecipientServiceApi
  with WorkflowServiceApi
  with UserServiceApi
{
  val route = {
    voucherServiceApiRoute ~
    projectServiceApiRoute ~
    recipientServiceApiRoute ~
    workflowServiceApiRoute ~
    userServiceApiRoute
  }
}
