package com.lambdaminute.slinkywrappers.web

import com.lambdaminute.slinkywrappers.macros.Macros.sourceAsString
import com.lambdaminute.slinkywrappers.materialui._
import com.lambdaminute.slinkywrappers.materialui.color.primary
import com.lambdaminute.slinkywrappers.materialui.variant._
import com.lambdaminute.slinkywrappers.semanticui.{Button => SuiButton}
import com.lambdaminute.slinkywrappers.web.highlight.Highlight
import slinky.core.StatelessComponent
import slinky.core.annotations.react
import slinky.web.html.div

import scala.scalajs.js
import scala.scalajs.js.Dynamic.literal
import scala.scalajs.js.annotation.JSImport

@JSImport("resources/App.css", JSImport.Default)
@js.native
object AppCSS extends js.Object

@JSImport("resources/logo.svg", JSImport.Default)
@js.native
object ReactLogo extends js.Object

trait Tits
class Boob[T] {
  type U = T with Tits
}

@react class MaterialUiDemo extends StatelessComponent {
  type Props = Unit

  private val css = AppCSS

  private val themeSettings = literal {
    palette = literal {
      primary = MaterialUi.colors.blue
    }
  }
  private val daftTheme: Theme = MaterialUi.createMuiTheme(themeSettings)


  def render() = {

    val avatar = Avatar(src = "https://www.gravatar.com/avatar/04801ed5aa62e5cfaedb25314fc9660d")
    val toolbar =
      Toolbar()(Typography(variant = textvariant.title, color = textcolor.inherit)("Material UI", avatar))
    MuiThemeProvider(theme = daftTheme)(
      div(
        AppBar(color = color.default, position = position.static)(toolbar),
        Button(color = color.default, variant = raised, size = size.small)("Demo Button"),
        Button(color = color.primary, variant = flat, size = size.medium)("Demo Button2"),
        Button(color = color.secondary, variant = fab, size = size.large)("Demo Button3"),
        SuiButton(primary = true)("Semantic UI Button")
      ))
  }
}
