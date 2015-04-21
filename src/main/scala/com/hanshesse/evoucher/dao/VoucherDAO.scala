package com.hanshesse.evoucher.dao

import com.hanshesse.evoucher.domain.Voucher
import scala.slick.driver.MySQLDriver.simple._

object VoucherDAO {

  /**
   * Represents the vouchers table in the database
  */
  class Vouchers(tag: Tag) extends Table[Voucher](tag, "vouchers") {

    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def serial = column[String]("serial")
    def PIN = column[String]("PIN", O.Nullable)

    def * = (id.?, serial, PIN.?) <> (Voucher.tupled, Voucher.unapply)
  }

  val vouchers = TableQuery[Vouchers]
}