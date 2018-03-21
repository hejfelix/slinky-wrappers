package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object ListItem extends ExternalComponent {
  case class Props(
      active: UndefOr[Boolean] = js.undefined,
      as: UndefOr[String] = js.undefined,
      className: UndefOr[String] = js.undefined,
      content: UndefOr[ReactElement] = js.undefined,
      description: UndefOr[ListDescription.type] = js.undefined,
      disabled: UndefOr[Boolean] = js.undefined,
      header: UndefOr[ListHeader.type] = js.undefined,
      icon: UndefOr[ListIcon.type] = js.undefined,
      image: UndefOr[Image.type] = js.undefined,
      onClick: UndefOr[EventHandler] = js.undefined,
      value: UndefOr[String] = js.undefined,
  )
  override val component = SemanticUiReact.List.Item
}
