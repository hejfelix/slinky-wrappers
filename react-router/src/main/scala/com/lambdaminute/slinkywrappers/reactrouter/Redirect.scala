package com.lambdaminute.slinkywrappers.reactrouter

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@react object Redirect extends ExternalComponent {
  case class Props(
      to: String | js.Object,
      from: String,
      push: UndefOr[Boolean] = js.undefined,
      exact: UndefOr[Boolean] = js.undefined,
      strict: UndefOr[Boolean] = js.undefined
  )

  override val component = ReactRouterDom.Redirect

}
