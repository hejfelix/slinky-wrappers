package com.lambdaminute.slinkywrappers.semanticui

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}

@react object AccordionTitle extends ExternalComponent {
  case class Props(
      active: UndefOr[Boolean] = js.undefined,
      as: UndefOr[String] = js.undefined,
      className: UndefOr[String] = js.undefined,
      content: UndefOr[ReactElement] = js.undefined,
      index: UndefOr[String | Int] = js.undefined,
      onClick: UndefOr[EventHandler] = js.undefined
  )
  override val component = SemanticUiReact.Accordion.Title
}
