package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@react object FormHelperText extends ExternalComponent {
  case class Props(component: UndefOr[String | js.Function] = js.undefined,
                   disabled: UndefOr[Boolean] = js.undefined,
                   error: UndefOr[Boolean] = js.undefined,
                   margin: UndefOr[Margin.dense.type] = js.undefined)
  override val component = MaterialUi.FormHelperText
}
