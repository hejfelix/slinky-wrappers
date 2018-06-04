package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponentWithAttributes
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object Button extends ExternalComponentWithAttributes[slinky.web.html.button.tag.type] {
  case class Props(color: UndefOr[color] = js.undefined,
                   className: UndefOr[String] = js.undefined,
                   variant: UndefOr[variant] = js.undefined,
                   disabled: UndefOr[Boolean] = js.undefined,
                   disableFocusRipple: UndefOr[Boolean] = js.undefined,
                   fullWidth: UndefOr[Boolean] = js.undefined,
                   href: UndefOr[String] = js.undefined,
                   mini: UndefOr[Boolean] = js.undefined,
                   onClick: UndefOr[EventHandler] = js.undefined,
                   size: UndefOr[size] = js.undefined,
  )
  override val component = MaterialUi.Button
}
