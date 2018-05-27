package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}
import align.ActionPosition
import Positions.TitlePosition
@react object GridListTileBar extends ExternalComponent {
  case class Props(
                  actionIcon: UndefOr[js.Object] = js.undefined,
                  actionPosition: UndefOr[ActionPosition] = js.undefined,
                  className: UndefOr[String] = js.undefined,
                  subtitle: UndefOr[String | js.Object] = js.undefined,
                  title: UndefOr[js.Object] = js.undefined,
                  titlePosition: UndefOr[TitlePosition] = js.undefined
                  )
  override val component = MaterialUi.GridListTileBar
}