package in.vinic.visity.domain.visit.repository

import in.vinic.visity.domain.visit.entity.Visit
import in.vinic.visity.domain.visit.valueobject.VisitId
import io.visity.domain.visit.entity.Visit

abstract class VisitCRUDRepository[F[_]] {
  def findById(visitId: VisitId): F[Option[Visit]]

  def findAll(): F[Set[Visit]]

  def create(visit: Visit): F[Visit]

  def update(visit: Visit): F[Visit]

  def delete(visitId: VisitId): F[Unit]
}
