package com.hanshesse.evoucher.Api

import spray.http.MediaTypes._
import spray.routing.HttpService


/**
 * Created by Hans Hesse on 22/04/15.
 */
trait UserServiceApi extends HttpService {
  val userServiceApiRoute =
    path("users") {
      get {
        respondWithMediaType(`text/html`) {
          complete {
            "users"
          }
        }
      }
    }
}
