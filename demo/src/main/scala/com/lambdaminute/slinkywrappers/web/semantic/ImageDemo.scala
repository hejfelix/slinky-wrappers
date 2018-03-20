package com.lambdaminute.slinkywrappers.web.semantic

import com.lambdaminute.slinkywrappers.macros.Macros.sourceAsString
import com.lambdaminute.slinkywrappers.semanticui.{Image, Size}
import com.lambdaminute.slinkywrappers.web.CodeSection
import slinky.core.StatelessComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.web.html.div

@react class ImageDemo extends StatelessComponent {
  type Props = Unit

  val src = "https://www.dccomics.com/sites/default/files/field/image/LEGOBatmanSongBlog_5893e3bf411b78.14780176.jpg"

  val sizes = List(Size.mini, Size.tiny, Size.small, Size.medium, Size.large)

  override def render(): ReactElement =
    div(
      sizes.map(s => Image(src = src, size = s)),
      CodeSection(code = sourceAsString)
    )
}
