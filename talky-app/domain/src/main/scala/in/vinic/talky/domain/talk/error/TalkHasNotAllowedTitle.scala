package in.vinic.talky.domain.talk.error

import in.vinic.talky.domain.common.error.DomainError

final case object TalkHasNotAllowedTitle extends DomainError("talk has not allowed title")
