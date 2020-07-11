package in.vinic.talky.domain.talk.entity

import java.util.UUID

import in.vinic.talky.domain.talk.valueobject.Title

final case class TalkId(value: UUID) extends AnyVal

final case class Talk(id: TalkId, title: Title, speaker: Speaker)
