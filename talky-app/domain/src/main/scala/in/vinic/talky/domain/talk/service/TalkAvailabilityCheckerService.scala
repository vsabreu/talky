package in.vinic.talky.domain.talk.service

import in.vinic.talky.domain.common.DomainErrorOr
import in.vinic.talky.domain.talk.entity.{Speaker, Talk}
import in.vinic.talky.domain.talk.validation.TalkHasAllowedTitleValidation

final class TalkAvailabilityCheckerService {
  def check(talk: Talk)(speaker: Speaker): DomainErrorOr[Talk] =
    for {
      _ <- TalkHasAllowedTitleValidation.validate(talk) // isso nao deveria ser validado no smart construct?
    } yield talk
}
