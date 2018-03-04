package com.lambdaminute.slinkywrappers.materialui

import scala.scalajs.js
import scala.scalajs.js.{|, UndefOr}

@js.native
trait TypeText extends js.Object {
  val primary: String   = js.native
  val secondary: String = js.native
  val disabled: String  = js.native
  val hint: String      = js.native
}

@js.native
trait TypeAction extends js.Object {
  val active: String             = js.native
  val hover: String              = js.native
  val selected: String           = js.native
  val disabled: String           = js.native
  val disabledBackground: String = js.native
}

@js.native
trait TypeBackground extends js.Object {
  val default: String = js.native
  val paper: String   = js.native
}

@js.native
trait PaletteColor extends js.Object {
  val light: String        = js.native
  val main: String         = js.native
  val dark: String         = js.native
  val contrastText: String = js.native
}

@js.native
trait Palette extends js.Object {
  val common: String                                = js.native
  val `type`: String                                = js.native
  val contrastThreshold: Double                     = js.native
  val tonalOffset: Double                           = js.native
  val primary: PaletteColor                         = js.native
  val secondary: PaletteColor                       = js.native
  val error: PaletteColor                           = js.native
  val grey: Color                                   = js.native
  val text: TypeText                                = js.native
  val divider: String                               = js.native
  val action: TypeAction                            = js.native
  val background: TypeBackground                    = js.native
  val getContrastText: js.Function1[String, String] = js.native;
}

@js.native
trait Theme extends js.Object {
  val direction: String      = js.native
  val palette: Palette       = js.native
  val typography: js.Object  = js.native
  val mixins: js.Object      = js.native
  val breakpoints: js.Object = js.native
  val shadows: js.Object     = js.native
  val transitions: js.Object = js.native
  val spacing: js.Object     = js.native
  val zIndex: js.Object      = js.native
}
@js.native
trait BreakPoints extends js.Object {
  val keys: Array[Breakpoint]                               = js.native
  val values: js.Object                                     = js.native
  val up: js.Function1[Breakpoint | Double, String]         = js.native
  val down: js.Function1[Breakpoint | Double, String]       = js.native
  val between: js.Function2[Breakpoint, Breakpoint, String] = js.native
  val only: js.Function1[Breakpoint, String]                = js.native
  val width: js.Function1[Breakpoint, Double]               = js.native
}

@js.native
trait BreakpointsOptions extends js.Object {
  val values: js.Object = js.native
  val unit: String      = js.native
  val step: Double      = js.native
}

@js.native
trait Mixins extends js.Object {
  val gutters: js.Function1[js.Object, js.Object] = js.native
  val toolbar: js.Object                          = js.native
}

@js.native
trait ThemeOptions extends js.Object {
  val breakpoints: UndefOr[BreakPointsOptionsAndBreakPoints]                            = js.native
  val mixins: UndefOr[Mixins]                                                           = js.native
  val palette: UndefOr[Palette]                                                         = js.native
  val typography: UndefOr[TypographyOptions | js.Function1[Palette, TypographyOptions]] = js.native
}

@js.native
trait CreateThemeParameters extends js.Object {
  val options: UndefOr[ThemeOptions] = js.native
}
