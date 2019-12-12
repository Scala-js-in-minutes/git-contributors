package scalajs.basics

import org.scalajs.dom._

trait HtmlElements {
  val noStyle = ""

  def div(style: String, children: Element*): Element = {
    val div = document.createElement("div")
    div.setAttribute("style", style)
    children.foreach(div.appendChild(_))
    div
  }

  def span(text: String): Element = {
    val span = document.createElement("span")
    span.textContent = text
    span
  }

  def img(src: String, style: String): Element = {
    val img = document.createElement("img")
    img.setAttribute("src", src)
    img.setAttribute("style", style)
    img
  }

  def a(text: String, href: String): Element = {
    val aTag = document.createElement("a")
    aTag.textContent = text
    aTag.setAttribute("href", href)
    aTag
  }
}
