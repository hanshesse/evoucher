package com.hanshesse.evoucher.domain


/**
 * Represents a voucher
 *
 * @param id      database id
 * @param serial  serial number of the voucher
 * @param PIN     hidden PIN of the voucher (may be blank)
 */
case class Voucher( id: Option[Int],
                    serial: String,
                    PIN: Option[String])
