package in.vinic.talky.domain.talk.event

import java.util.UUID

import in.vinic.talky.domain.common.event.DomainEventBaseFields
import in.vinic.talky.domain.common.event.DomainEventBaseFields

final case class TalkScheduledDomainEvent(
    override val appId: String,
    override val eventId: UUID,
    override val eventType: String,
    override val eventTime: Long
) extends DomainEventBaseFields
