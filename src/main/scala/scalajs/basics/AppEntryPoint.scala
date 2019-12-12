package scalajs.basics

import org.scalajs.dom._
import org.scalajs.dom.ext.Ajax
import upickle.default.{macroRW, ReadWriter => RW, _}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object AppEntryPoint extends App with HtmlElements {

  window.onload = { _: Event =>
    getContributors("gitster", "git").andThen {
      case Success(contributors) => displayAllContributors(contributors)
      case Failure(e) => println(e)
    }
  }

  private def getContributors(user: String, project: String): Future[List[Contributor]] =
    Ajax.get(url = s"https://api.github.com/repos/$user/$project/contributors")
      .map { xhr =>
        implicit val rw: RW[Contributor] = macroRW
        read[List[Contributor]](xhr.responseText)
      }

  private def displayAllContributors(contributors: List[Contributor]): Unit = contributors.foreach { contributor =>
    val container = document.getElementById("container")
    container.appendChild(
      div("float:left; padding: 10px; border-style: dotted; border-width: 1px;",
        div(noStyle,
          a(contributor.user, contributor.githubPage),
          span(s" (${contributor.contributions})")
        ),
        div(noStyle, img(contributor.imageUrl, "max-width: 100px; max-height: 100px")),
      )
    )
  }
}



