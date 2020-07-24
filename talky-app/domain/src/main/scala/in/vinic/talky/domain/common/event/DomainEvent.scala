package in.vinic.talky.domain.common.event

import java.util.UUID

// make a custom type for these event info
trait DomainEvent {
  def appId: String

  def eventId: UUID

  def eventType: String

  def eventTime: Long
}
