package in.vinic.talky.application.common.command

import in.vinic.talky.domain.common.command.DomainCommand
import in.vinic.talky.domain.common.entity.Entity

abstract class CommandHandler[C <: DomainCommand, E <: Entity, F[_]] {
  def handle(command: C): F[E]
}
