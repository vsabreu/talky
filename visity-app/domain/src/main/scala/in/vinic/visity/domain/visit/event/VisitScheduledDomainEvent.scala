package in.vinic.visity.domain.visit.event

import java.util.UUID

import in.vinic.visity.domain.common.event.DomainEventBaseFields
import io.visity.domain.common.event.DomainEventBaseFields

final case class VisitScheduledDomainEvent(
    override val appId: String,
    override val eventId: UUID,
    override val eventType: String,
    override val eventTime: Long
) extends DomainEventBaseFields
