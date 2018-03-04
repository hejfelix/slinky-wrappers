package com.lambdaminute.frase.web

import com.lambdaminute.slinkywrappers.materialui.Button
import com.lambdaminute.slinkywrappers.materialui.size
import com.lambdaminute.slinkywrappers.materialui.color
import com.lambdaminute.slinkywrappers.materialui.variant._
import slinky.core.StatelessComponent
import slinky.core.annotations.react
import slinky.web.html._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("resources/App.css", JSImport.Default)
@js.native
object AppCSS extends js.Object

@JSImport("resources/logo.svg", JSImport.Default)
@js.native
object ReactLogo extends js.Object

@react class App extends StatelessComponent {
  type Props = Unit

  private val css = AppCSS

  def render() =
    div(className := "App")(
      h1(className := "App-title")("Welcome to slinky wrappers demo"),
      Button(color = color.default, variant = raised, size = size.small)("Demo Button"),
      Button(color = color.primary, variant = flat, size = size.medium)("Demo Button2"),
      Button(color = color.secondary, variant = fab, size = size.large)("Demo Button3")
    )
}
