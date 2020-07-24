package in.vinic.talky.domain.talk.event

import java.util.UUID

import in.vinic.talky.domain.common.event.DomainEvent
import in.vinic.talky.domain.common.event.DomainEvent

final case class TalkScheduledDomainEvent(
    override val appId: String,
    override val eventId: UUID,
    override val eventType: String,
    override val eventTime: Long
) extends DomainEvent
