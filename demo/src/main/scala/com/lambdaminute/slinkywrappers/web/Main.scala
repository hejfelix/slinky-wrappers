package com.lambdaminute.slinkywrappers.web

import com.lambdaminute.slinkywrappers.reactrouter.{BrowserRouter, Link, Route, RouteProps}
import org.scalajs.dom
import slinky.core.StatelessComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.hot
import slinky.web.ReactDOM
import slinky.web.html._

import scala.scalajs.js.annotation.{JSExportTopLevel, JSImport}
import scala.scalajs.{LinkingInfo, js}

@JSImport("resources/index.css", JSImport.Default)
@js.native
object IndexCSS extends js.Object

object Main {
  val css = IndexCSS

  @JSExportTopLevel("entrypoint.main")
  def main(): Unit = {
    if (LinkingInfo.developmentMode) {
      hot.initialize()
    }

    val container = Option(dom.document.getElementById("root")).getOrElse {
      val elem = dom.document.createElement("div")
      elem.id = "root"
      dom.document.body.appendChild(elem)
      elem
    }

    ReactDOM.render(div(Demos()), container)
  }
}

@react class Demos extends StatelessComponent {
  type Props = Unit

  def render(): ReactElement = {
    val route1        = "/"
    val semanticRoute = "/semantic"
    val materialRoute = "/material"
    BrowserRouter(
      div(
        ul(
          li(Link(to = route1)("Home")),
          li(Link(to = semanticRoute)("Semantic UI Demo")),
          li(Link(to = materialRoute)("Material UI Demo"))
        ),
        Route(exact = true, path = route1, render = _ => h1("Hello!")),
        Route(exact = true, path = semanticRoute, render = _ => SemanticUiDemo()),
        Route(exact = true, path = materialRoute, render = _ => MaterialUiDemo())
      )
    )
  }

}

@react class Page1 extends StatelessComponent {
  type Props = RouteProps
  def render(): ReactElement = div(
    h1(props.location.pathname.toString)
  )
}
