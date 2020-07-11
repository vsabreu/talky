package in.vinic.talky.domain.talk.entity

import java.util.UUID

import in.vinic.talky.domain.common.entity.PersonName

final case class SpeakerId(id: UUID) extends AnyVal

final case class Speaker(id: SpeakerId, name: PersonName)
