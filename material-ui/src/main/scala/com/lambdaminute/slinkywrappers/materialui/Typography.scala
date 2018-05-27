package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object Typography extends ExternalComponent {
  case class Props(align: UndefOr[align] = js.undefined,
                   className: UndefOr[String] = js.undefined,
                   color: UndefOr[textcolor] = js.undefined,
                   component: UndefOr[String] = js.undefined,
                   gutterBottom: UndefOr[Boolean] = js.undefined,
                   noWrap: UndefOr[Boolean] = js.undefined,
                   paragraph: UndefOr[Boolean] = js.undefined,
                   variant: UndefOr[textvariant] = js.undefined,
                  )

  override val component = MaterialUi.Typography

}
