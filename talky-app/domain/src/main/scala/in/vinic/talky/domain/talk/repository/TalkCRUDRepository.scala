package in.vinic.talky.domain.talk.repository

import in.vinic.talky.domain.talk.entity.{Talk, TalkId}

abstract class TalkCRUDRepository[F[_]] {
  def findById(talkId: TalkId): F[Option[Talk]]

  def findAll(): F[Set[Talk]]

  def create(talk: Talk): F[Talk]

  def update(talk: Talk): F[Talk]

  def delete(talkId: TalkId): F[Unit]
}
