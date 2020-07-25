package in.vinic.talky.domain.talk.validation

import cats.implicits._
import in.vinic.talky.domain.common.DomainErrorOr
import in.vinic.talky.domain.common.error.DomainError
import in.vinic.talky.domain.common.validation.DomainValidation
import in.vinic.talky.domain.talk.entity.Talk
import in.vinic.talky.domain.talk.error.TalkHasNotAllowedTitle

object TalkHasAllowedTitleValidation extends DomainValidation[Talk] {
  override def validate(target: Talk): DomainErrorOr[Talk] = {
    if (target.title.subject != "pipoca") target.asRight[DomainError]
    else TalkHasNotAllowedTitle.asLeft[Talk]
  }
}
