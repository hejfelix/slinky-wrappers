package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@react object GridListTile extends ExternalComponent {
  case class Props(
      className: UndefOr[String] = js.undefined,
      cols: UndefOr[Int] = js.undefined,
      component: UndefOr[String | js.Function] = js.undefined,
      rows: UndefOr[Int] = js.undefined
  )
  override val component = MaterialUi.GridListTile
}
