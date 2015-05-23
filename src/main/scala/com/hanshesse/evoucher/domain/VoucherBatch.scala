package com.hanshesse.evoucher.domain

/**
 * Represents a batch of vouchers
 *
 * @param id      unique id
 * @param name    name of the batch
 */
case class VoucherBatch(id: Option[Int],
                   name: String)
