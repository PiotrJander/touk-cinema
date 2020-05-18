package me.piotrjander.cinema.domain.entity

case class MovieId(id: String) extends AnyVal

case class Movie(id: Option[MovieId], title: String)
