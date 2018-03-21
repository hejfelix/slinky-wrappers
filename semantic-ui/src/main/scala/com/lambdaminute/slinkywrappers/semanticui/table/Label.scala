package com.lambdaminute.slinkywrappers.semanticui.table

import com.lambdaminute.slinkywrappers.semanticui._
import Spacing._
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}
@react object Label extends ExternalComponent {

  type Attached    = top.type | bottom.type | `top right`.type | `top left`.type | `bottom left`.type | `bottom right`.type
  type LabelDetail = js.Any

  case class Props(
      active: UndefOr[Boolean] = js.undefined,
      as: UndefOr[String] = js.undefined,
      attached: UndefOr[Attached] = js.undefined,
      basic: UndefOr[Boolean] = js.undefined,
      circular: UndefOr[Boolean] = js.undefined,
      className: UndefOr[String] = js.undefined,
      color: UndefOr[Color] = js.undefined,
      content: UndefOr[ReactElement] = js.undefined,
      corner: UndefOr[Boolean | left.type | right.type] = js.undefined,
      detail: UndefOr[LabelDetail] = js.undefined,
      empty: UndefOr[Boolean] = js.undefined,
      floating: UndefOr[Boolean] = js.undefined,
      horizontal: UndefOr[Boolean] = js.undefined,
      icon: UndefOr[Icon.type] = js.undefined,
      image: UndefOr[Boolean] = js.undefined,
      onClick: UndefOr[EventHandler] = js.undefined,
      onRemove: UndefOr[EventHandler] = js.undefined,
      pointing: UndefOr[Boolean] = js.undefined,
      ribbon: UndefOr[Boolean | right.type] = js.undefined,
      size: UndefOr[Size] = js.undefined,
      tag: UndefOr[Boolean] = js.undefined,
  )

  override val component = SemanticUiReact.Label

}
