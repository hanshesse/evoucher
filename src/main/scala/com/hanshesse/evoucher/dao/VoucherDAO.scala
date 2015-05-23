package com.hanshesse.evoucher.dao

import com.hanshesse.evoucher.domain.Voucher
import slick.driver.MySQLDriver
import slick.driver.MySQLDriver.api._

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.util.control.NonFatal
import scala.util.{Failure, Success}

object VoucherDAO extends EvoucherDb {

  /**
   * Represents the vouchers table in the database
  */
  class Vouchers(tag: Tag) extends Table[Voucher](tag, "vouchers") {

    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def serial = column[String]("serial")
    def PIN = column[String]("PIN")

    def * = (id.?, serial, PIN.?) <> (Voucher.tupled, Voucher.unapply)
  }

  val vouchers = TableQuery[Vouchers]

  def addVoucher(voucher: Voucher) = {
    val insertAction = DBIO.seq(
      //vouchers += voucher,
      vouchers += voucher
    )

    val resultFuture = db.run(insertAction)

    Await.result(resultFuture, 3 seconds)
  }
}