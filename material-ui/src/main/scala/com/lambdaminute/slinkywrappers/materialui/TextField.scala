package com.lambdaminute.slinkywrappers.materialui

import slinky.core.annotations.react
import slinky.core.{ExternalComponent, ReactComponentClass}

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}

sealed trait Margin
object Margin extends Margin with EnumWriter {
  case object none   extends Margin
  case object dense  extends Margin
  case object normal extends Margin
}

@react object TextField extends ExternalComponent {
  case class Props(
      autoFocus: UndefOr[Boolean] = js.undefined,
      defaultValue: UndefOr[String | Double] = js.undefined,
      disabled: UndefOr[Boolean] = js.undefined,
      error: UndefOr[Boolean] = js.undefined,
      FormHelperTextProps: UndefOr[js.Object] = js.undefined,
      fullWidth: UndefOr[Boolean] = js.undefined,
      helperText: UndefOr[ReactComponentClass] = js.undefined,
      id: UndefOr[String] = js.undefined,
      InputLabelProps: UndefOr[js.Object] = js.undefined,
      InputProps: UndefOr[js.Object] = js.undefined,
      inputProps: UndefOr[js.Object] = js.undefined,
      inputRef: UndefOr[js.Function] = js.undefined,
      label: UndefOr[ReactComponentClass] = js.undefined,
      margin: UndefOr[Margin] = js.undefined,
      multiline: UndefOr[Boolean] = js.undefined,
      name: UndefOr[String] = js.undefined,
      onChange: UndefOr[js.Function] = js.undefined,
      placeholder: UndefOr[String] = js.undefined,
      required: UndefOr[Boolean] = js.undefined,
      rows: UndefOr[String | Int] = js.undefined,
      rowsMax: UndefOr[String | Int] = js.undefined,
      select: UndefOr[Boolean] = js.undefined,
      SelectProps: UndefOr[js.Object] = js.undefined,
      `type`: UndefOr[String] = js.undefined,
      value: UndefOr[String | Double | Array[js.Object]] = js.undefined
  )

  override val component = MaterialUi.TextField
}
