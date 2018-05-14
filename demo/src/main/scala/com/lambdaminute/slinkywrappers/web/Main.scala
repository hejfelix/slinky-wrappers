package com.lambdaminute.slinkywrappers.web

import com.lambdaminute.slinkywrappers.reactrouter._
import org.scalajs.dom
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.core.{Component, ReactComponentClass, StatelessComponent}
import slinky.hot
import slinky.web.ReactDOM
import slinky.web.html._

import scala.scalajs.js.annotation.{JSExportTopLevel, JSImport}
import scala.scalajs.{js, LinkingInfo}

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

    val element: ReactElement = withRouter(Demos)
    ReactDOM.render(BrowserRouter(element), container)
  }
}

@react class Demos extends Component {
  type Props = RouteProps

  case class State(path: String = "")

  override def componentDidMount(): Unit = {
    super.componentDidMount()
    println("COMPONENT MOUNTED")
  }

  override def initialState: State = State()

  def render(): ReactElement = {
    val route1        = "/"
    val semanticRoute = "/semantic"
    val materialRoute = "/material"
    div(
      h1(s"WITHROUTER STUFF: ${props.location.pathname}"),
      ul(
        li(Link(to = route1)("Home")),
        li(Link(to = semanticRoute)("Semantic UI Demo")),
        li(Link(to = materialRoute)("Material UI Demo"))
      ),
      Route(exact = true, path = route1, render = _ => h1("Hello!")),
      Route(exact = true, path = semanticRoute, render = _ => SemanticUiDemo()),
      Route(exact = true, path = materialRoute, render = _ => MaterialUiDemo())
    )
  }

}
//
//@react class WithRouterComp extends StatelessComponent {
//  type Props = RouteProps
//  def render() = h1(s"WithRouterComponent: ${this.props.location.}")
//}

@react class Page1 extends StatelessComponent {
  type Props = RouteProps
  def render(): ReactElement = div(
    h1(props.location.pathname.toString)
  )
}
