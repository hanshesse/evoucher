package com.hanshesse.evoucher.Api

import spray.http.MediaTypes._
import spray.routing.HttpService


/**
 * Created by Hans Hesse on 22/04/15.
 */
trait WorkflowServiceApi extends HttpService {
  val workflowServiceApiRoute =
    path("workflows") {
      get {
        respondWithMediaType(`text/html`) {
          complete {
            "workflows"
          }
        }
      }
    }
}
