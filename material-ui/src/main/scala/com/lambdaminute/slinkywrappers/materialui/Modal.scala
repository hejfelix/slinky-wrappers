package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}

@react object Modal extends ExternalComponent {
case class Props(
                BackdropComponent: UndefOr[String | js.Function] = js.undefined,
                BackdropProps: UndefOr[js.Object] = js.undefined,
                container: UndefOr[js.Object | js.Function] = js.undefined,
                disableAutoFocus: UndefOr[Boolean] = js.undefined,
                disableBackdropClick: UndefOr[Boolean] = js.undefined,
                disableEnforceFocus: UndefOr[Boolean] = js.undefined,
                disableEscapeKeyDown: UndefOr[Boolean] = js.undefined,
                disableRestoreFocus: UndefOr[Boolean] = js.undefined,
                hideBackdrop: UndefOr[Boolean] = js.undefined,
                keepMounted: UndefOr[Boolean] = js.undefined,
                manager: UndefOr[js.Object] = js.undefined,
                onBackdropClick: UndefOr[EventHandler] = js.undefined,
                onClose: UndefOr[EventHandler] = js.undefined,
                onEscapeKeyDown: UndefOr[EventHandler] = js.undefined,
                onRendered: UndefOr[js.Function] = js.undefined,
                open: Boolean
                )
  override val component = MaterialUi.Modal

}
