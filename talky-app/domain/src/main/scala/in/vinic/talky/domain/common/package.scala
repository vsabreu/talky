package in.vinic.talky.domain

import in.vinic.talky.domain.common.entity.Entity
import in.vinic.talky.domain.common.error.DomainError

package object common {
  type DomainErrorOr[A <: Entity] = Either[DomainError, A]
}
