package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@react object MList extends ExternalComponent {

  case class Props(
      className: UndefOr[String] = js.undefined,
      component: UndefOr[String | js.Function] = js.undefined,
      dense: UndefOr[Boolean] = js.undefined,
      disablePadding: UndefOr[Boolean] = js.undefined,
      subheader: UndefOr[ReactElement] = js.undefined
  )

  override val component = MaterialUi.List

}

@react object ListItem extends ExternalComponent {
  case class Props(
      button: UndefOr[Boolean] = js.undefined,
      className: UndefOr[String] = js.undefined,
      component: UndefOr[String | js.Function] = js.undefined,
      ContainerComponent: UndefOr[String | js.Function] = js.undefined,
      ContainerProps: UndefOr[js.Object] = js.undefined,
      dense: UndefOr[Boolean] = js.undefined,
      disableGutters: UndefOr[Boolean] = js.undefined,
      divider: UndefOr[Boolean] = js.undefined,
  )
  override val component = MaterialUi.ListItem
}

@react object ListItemAvatar extends ExternalComponent {
  case class Props(className: UndefOr[String] = js.undefined)
  override val component = MaterialUi.ListItemAvatar

}

@react object ListItemIcon extends ExternalComponent {
  case class Props(className: UndefOr[String] = js.undefined)
  override val component = MaterialUi.ListItemIcon

}

@react object ListItemSecondaryAction extends ExternalComponent {
  case class Props(className: UndefOr[String] = js.undefined)
  override val component = MaterialUi.ListItemSecondaryAction

}
@react object ListItemText extends ExternalComponent {
  case class Props(
      className: UndefOr[String] = js.undefined,
      disableTypography: UndefOr[Boolean] = js.undefined,
      inset: UndefOr[Boolean] = js.undefined,
      primary: UndefOr[ReactElement] = js.undefined,
      secondary: UndefOr[ReactElement] = js.undefined
  )
  override val component = MaterialUi.ListItemText

}
@react object ListSubheader extends ExternalComponent {
  case class Props(
      className: UndefOr[String] = js.undefined,
      color: UndefOr[color] = js.undefined,
      inset: UndefOr[Boolean] = js.undefined,
      primary: UndefOr[ReactElement] = js.undefined,
      secondary: UndefOr[ReactElement] = js.undefined
  )
  override val component = MaterialUi.ListSubheader

}
