package com.lambdaminute.slinkywrappers.reactrouter

import slinky.core.{ExternalComponent, ReactComponentClass}
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

case class Match(params: js.Object, isExact: Boolean, path: String, url: String)
case class Location(key: String, pathname: String, search: String, hash: String, state: js.Object)
case class History(length: Int,
                   action: String,
                   location: Location,
                   push: js.Function,
                   replace: js.Function,
                   go: js.Function,
                   goBack: js.Function,
                   goForward: js.Function,
                   block: js.Function)

case class RouteProps(`match`: Match, location: js.Object, history: js.Object)

@react object Route extends ExternalComponent {

  case class Props(path: String,
                   component: ReactComponentClass,
                   render: UndefOr[Boolean] = js.undefined,
                   exact: UndefOr[Boolean] = js.undefined,
                   location: UndefOr[js.Object] = js.undefined,
                   sensitive: UndefOr[Boolean] = js.undefined)

  override val component = ReactRouterDom.Route

}
