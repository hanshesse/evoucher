package com.hanshesse.evoucher.domain

/**
 * Represents a voucher recipient
 *
 * @param id          unique id
 * @param personalId  personal ID
 */
case class Recipient(id: Option[Int],
                   personalId: String)
