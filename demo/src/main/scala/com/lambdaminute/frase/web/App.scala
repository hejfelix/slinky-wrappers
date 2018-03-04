package com.lambdaminute.frase.web

import com.lambdaminute.slinkywrappers.materialui._
import com.lambdaminute.slinkywrappers.materialui.variant._
import slinky.core.StatelessComponent
import slinky.core.annotations.react
import slinky.web.html.div

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

  def render() = {
    val avatar = Avatar(src = "https://www.gravatar.com/avatar/04801ed5aa62e5cfaedb25314fc9660d")
    val toolbar =
      Toolbar()(Typography(variant = textvariant.title, color = textcolor.inherit)("Slinky Wrappers Demo", avatar))
    div(
      AppBar(color = color.default, position = position.static)(toolbar),
      Button(color = color.default, variant = raised, size = size.small)("Demo Button"),
      Button(color = color.primary, variant = flat, size = size.medium)("Demo Button2"),
      Button(color = color.secondary, variant = fab, size = size.large)("Demo Button3")
    )
  }
}
