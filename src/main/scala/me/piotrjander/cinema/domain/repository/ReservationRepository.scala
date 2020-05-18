package me.piotrjander.cinema.domain.repository

import me.piotrjander.cinema.domain.entity.{Reservation, ReservationId}

trait ReservationRepository[F[_]] {

  def create(reservation: Reservation): F[Unit]

  def get(id: ReservationId): F[Option[Reservation]]

  def update(id: ReservationId, reservation: Reservation): F[Unit]

  def delete(id: ReservationId): F[Unit]

}
