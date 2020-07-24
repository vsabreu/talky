package in.vinic.talky.domain.common.entity

import java.util.UUID

final case class EntityId(value: UUID)

trait Entity {
  def id: EntityId
}
