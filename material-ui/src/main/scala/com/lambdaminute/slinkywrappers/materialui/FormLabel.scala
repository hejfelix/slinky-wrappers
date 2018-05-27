package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@react object FormLabel extends ExternalComponent {
  case class Props(className: UndefOr[String] = js.undefined,
                   component: UndefOr[String | js.Function] = js.undefined,
                   disabled: UndefOr[Boolean] = js.undefined,
                   error: UndefOr[Boolean] = js.undefined,
                   focused: UndefOr[Boolean] = js.undefined,
                   required: UndefOr[Boolean] = js.undefined)
  override val component = MaterialUi.FormLabel
}
