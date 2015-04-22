package com.hanshesse.evoucher.Api

import spray.http.MediaTypes._
import spray.routing.HttpService


/**
 * Created by Hans Hesse on 22/04/15.
 */
trait RecipientServiceApi extends HttpService {
  val recipientServiceApiRoute =
    path("recipients") {
      get {
        respondWithMediaType(`text/html`) {
          complete {
            "recipients"
          }
        }
      }
    }
}
