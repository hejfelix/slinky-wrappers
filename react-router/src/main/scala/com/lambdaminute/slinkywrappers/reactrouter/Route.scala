package com.lambdaminute.slinkywrappers.reactrouter

import slinky.core.{ExternalComponent, ExternalComponentWithAttributes, ReactComponentClass}
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.readwrite.Reader
import slinky.web.html.{*, h1, s}

import scala.scalajs.js
import scala.scalajs.js.UndefOr

case class Match(params: js.Object, isExact: Boolean, path: String, url: String)
case class Location(key: UndefOr[String], pathname: UndefOr[String], search: UndefOr[String], hash: UndefOr[String])
case class History(length: Int,
                   action: String,
                   location: Location,
                   push: js.Function,
                   replace: js.Function,
                   go: js.Function,
                   goBack: js.Function,
                   goForward: js.Function,
                   block: js.Function)

case class RouteProps(`match`:Match, location: Location, history: History)

@react object Route extends ExternalComponent {

  def renderFunc(f: (RouteProps) => ReactElement): js.Function =
    (obj: js.Object) =>
     f(Reader.generic[RouteProps].read(obj))

  def apply(path: String,
            render: RouteProps => ReactElement,
            exact: UndefOr[Boolean] = js.undefined,
            location: UndefOr[js.Object] = js.undefined,
            sensitive: UndefOr[Boolean] = js.undefined):ReactElement =
    this.apply(Props(path,renderFunc(render),exact,location,sensitive))

  case class Props(path: String,
                   render: UndefOr[js.Function],
                   exact: UndefOr[Boolean],
                   location: UndefOr[js.Object],
                   sensitive: UndefOr[Boolean])

  override val component = ReactRouterDom.Route

}
