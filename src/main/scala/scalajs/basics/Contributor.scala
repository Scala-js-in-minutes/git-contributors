package scalajs.basics

import upickle.implicits.key

case class Contributor
(
  @key("login")
  user: String,

  @key("html_url")
  githubPage: String,

  @key("avatar_url")
  imageUrl: String,

  @key("contributions")
  contributions: Int
)
