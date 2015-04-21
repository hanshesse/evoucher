package com.hanshesse.evoucher.workflow

/**
  * Represents a state in a voucher workflow.
 */
sealed trait WorkflowState

/**
  * Represents a voucher in an inactive state, eligible to be activated.
 */
case object Inactive extends WorkflowState

/**
  * Represents a voucher in an activated state, eligible to be redeemed.
 */
case object Activated extends WorkflowState

/**
  * Represents a voucher in a redeemed state.
 */
case object Redeemed extends WorkflowState

/**
 * Represents a voucher that has been cancelled and is now longer usable.
 */
case object Cancelled extends WorkflowState


/**
 * Represents an event in a voucher workflow
 */
sealed trait WorkflowEvent

/**
 * Event for activating a voucher
 */
case object Activation extends WorkflowEvent

/**
 * Event for deactivating a voucher
 */
case object Deactivation extends WorkflowEvent

/**
 * Event for redeeming a voucher
 */
case object Redemption extends WorkflowEvent

/**
 * Event for cancelling a voucher
 */
case object Cancellation extends WorkflowEvent