package scalajs.basics

import scala.scalajs.js

@js.native
trait Contributor extends js.Object {
  val login: String
  val html_url: String
  val avatar_url: String
  val contributions: Int
}