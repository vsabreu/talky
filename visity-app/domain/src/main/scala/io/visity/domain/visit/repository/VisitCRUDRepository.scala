package io.visity.domain.visit.repository

import io.visity.domain.visit.entity.Visit
import io.visity.domain.visit.valueobject.VisitId

abstract class VisitCRUDRepository[F[_]] {
  def findById: VisitId => F[Option[Visit]]

  def findAll: () => F[Set[Visit]]

  def create: Visit => F[Visit]

  def update: Visit => F[Visit]

  def delete: Visit => F[Unit]
}
