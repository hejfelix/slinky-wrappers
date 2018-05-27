package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@react object FormControl extends ExternalComponent {

  case class Props(className: UndefOr[String] = js.undefined,
                   component: UndefOr[String | js.Function] = js.undefined,
                   disabled: UndefOr[Boolean] = js.undefined,
                   error: UndefOr[Boolean] = js.undefined,
                   fullWidth: UndefOr[Boolean] = js.undefined,
                   margin: UndefOr[Margin] = js.undefined,
                   required: UndefOr[Boolean] = js.undefined)

  override val component = MaterialUi.FormControl
}
