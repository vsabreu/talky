package in.vinic.talky.domain.common.validation

import in.vinic.talky.domain.common.DomainErrorOr

trait DomainValidation[A] {
  def validate(target: A): DomainErrorOr[A]
}
