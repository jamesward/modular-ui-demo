package models

case class Organization(id: Int, name: String, modules: Seq[String], users: Seq[User])
