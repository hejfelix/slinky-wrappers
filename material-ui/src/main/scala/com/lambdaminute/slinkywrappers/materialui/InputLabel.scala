package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object InputLabel extends ExternalComponent {
  case class Props(className: UndefOr[String] = js.undefined,
                   disableAnimation: UndefOr[Boolean] = js.undefined,
                   disabled: UndefOr[Boolean] = js.undefined,
                   error: UndefOr[Boolean] = js.undefined,
                   focused: UndefOr[Boolean] = js.undefined,
                   FormLabelClasses: UndefOr[js.Object] = js.undefined,
                   margin: UndefOr[Margin.dense.type] = js.undefined,
                   required: UndefOr[Boolean] = js.undefined,
                   shrink: UndefOr[Boolean] = js.undefined)
  override val component = MaterialUi.InputLabel
}
