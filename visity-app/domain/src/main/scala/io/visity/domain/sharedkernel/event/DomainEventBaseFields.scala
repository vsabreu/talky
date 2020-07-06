package io.visity.domain.sharedkernel.event

import java.util.UUID

// make a custom type for these event info
trait DomainEventBaseFields {
  def appId: String

  def eventId: UUID

  def eventType: String

  def eventTime: Long
}
