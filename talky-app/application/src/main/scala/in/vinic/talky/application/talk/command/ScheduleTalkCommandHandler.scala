package in.vinic.talky.application.talk.command

import cats.Functor

import in.vinic.talky.application.common.command.CommandHandler
import in.vinic.talky.domain.talk.command.ScheduleTalkCommand
import in.vinic.talky.domain.talk.entity.Talk

final class ScheduleTalkCommandHandler[F[_]: Functor] extends CommandHandler[ScheduleTalkCommand, Talk, F] {
  override def handle(command: ScheduleTalkCommand): F[Talk] = {
    ???
  }
}
