package com.hanshesse.evoucher.dao

import slick.driver.MySQLDriver.api._


/**
 * Created by Hans Hesse on 23/05/15.
 */
trait EvoucherDb  {
  lazy val db = Database.forConfig("db")
}
