package com.lambdaminute.slinkywrappers.semanticui

import com.lambdaminute.slinkywrappers.semanticui.Adverbs.very
import com.lambdaminute.slinkywrappers.semanticui.Spacing._
import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@react object List_ extends ExternalComponent {
  case class Props(
      animated: UndefOr[Boolean] = js.undefined,
      as: UndefOr[String] = js.undefined,
      bulleted: UndefOr[Boolean] = js.undefined,
      celled: UndefOr[Boolean] = js.undefined,
      className: UndefOr[String] = js.undefined,
      content: UndefOr[ReactElement] = js.undefined,
      divided: UndefOr[Boolean] = js.undefined,
      floated: UndefOr[left.type | right.type] = js.undefined,
      horizontal: UndefOr[Boolean] = js.undefined,
      inverted: UndefOr[Boolean] = js.undefined,
      items: UndefOr[List[ReactElement]] = js.undefined,
      link: UndefOr[Boolean] = js.undefined,
      onItemClick: UndefOr[EventHandler] = js.undefined,
      ordered: UndefOr[Boolean] = js.undefined,
      relaxed: UndefOr[Boolean | very.type] = js.undefined,
      selection: UndefOr[Boolean] = js.undefined,
      size: UndefOr[Size] = js.undefined,
      verticalAlign: UndefOr[bottom.type | middle.type | top.type] = js.undefined
  )
  override val component = SemanticUiReact.List
}
