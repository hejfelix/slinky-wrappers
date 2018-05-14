package com.lambdaminute.slinkywrappers.reactrouter

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
