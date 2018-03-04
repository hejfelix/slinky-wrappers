package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object Button extends ExternalComponent {
  case class Props(color: UndefOr[color] = js.undefined,
                   variant: UndefOr[variant] = js.undefined,
                   disabled: UndefOr[Boolean] = js.undefined,
                   disableFocusRipple: UndefOr[Boolean] = js.undefined,
                   fullWidth: UndefOr[Boolean] = js.undefined,
                   href: UndefOr[String] = js.undefined,
                   mini: UndefOr[Boolean] = js.undefined,
                   size: UndefOr[size] = js.undefined,
  )
  override val component = MaterialUi.Button
}
