package in.vinic.talky.domain.talk.entity

import java.util.UUID

final case class SpeakerId(id: UUID) extends AnyVal

final case class PersonName(firstName: String, lastName: String)

final case class Speaker(id: SpeakerId, name: PersonName)
