package io.visity.domain.visit.event

import java.util.UUID

import io.visity.domain.sharedkernel.event.DomainEventBaseFields

final case class VisitScheduledDomainEvent(
    override val appId: String,
    override val eventId: UUID,
    override val eventType: String,
    override val eventTime: Long
) extends DomainEventBaseFields
