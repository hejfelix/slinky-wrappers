package com.lambdaminute.slinkywrappers.semanticui

import com.lambdaminute.slinkywrappers.semanticui.Spacing._
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@react object GridColumn extends ExternalComponent {
  case class Props(
      as: UndefOr[String] = js.undefined,
      className: UndefOr[String] = js.undefined,
      color: UndefOr[Color] = js.undefined,
      computer: UndefOr[Number] = js.undefined,
      floated: UndefOr[left.type | right.type] = js.undefined,
      largeScreen: UndefOr[Number] = js.undefined,
      mobile: UndefOr[Number] = js.undefined,
      only: UndefOr[String] = js.undefined,
      stretched: UndefOr[Boolean] = js.undefined,
      tablet: UndefOr[Number] = js.undefined,
      textAlign: UndefOr[left.type | center.type | right.type | justified.type] = js.undefined,
      verticalAlign: UndefOr[bottom.type | middle.type | top.type] = js.undefined,
      wideScreen: UndefOr[Number] = js.undefined,
      width: UndefOr[Number] = js.undefined
  )
  override val component = SemanticUiReact.Grid.Column

}
