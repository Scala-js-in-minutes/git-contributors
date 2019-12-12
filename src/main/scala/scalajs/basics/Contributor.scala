package scalajs.basics

import scala.scalajs.js

@js.native
trait Contributor extends js.Object {
  val login: String = js.native
  val html_url: String = js.native
  val avatar_url: String = js.native
  val contributions: Int = js.native
}