package in.vinic.talky.domain.talk.entity

import java.util.UUID

import in.vinic.talky.domain.common.entity.{Entity, EntityId}
import in.vinic.talky.domain.talk.valueobject.Title

final case class TalkId(value: UUID) extends AnyVal

final case class Talk(override val id: EntityId, title: Title, speaker: Speaker) extends Entity
