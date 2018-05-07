package com.lambdaminute.slinkywrappers.web.semantic

import com.lambdaminute.slinkywrappers.macros.Macros.sourceAsString
import com.lambdaminute.slinkywrappers.semanticui.{IconName, ListContent, ListIcon, ListItem, List_ => SList}
import com.lambdaminute.slinkywrappers.web.CodeSection
import slinky.core.StatelessComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.web.html.div

@react class ListDemo extends StatelessComponent {

  type Props = Unit

  private val icons = List(IconName.`google`, IconName.`hacker news`, IconName.`computer`, IconName.`magic`)
  private val list  = SList(icons.map(i => ListItem(ListIcon(name = i), ListContent(i.toString))))

  override def render(): ReactElement =
    div(list, CodeSection(code = sourceAsString))

}
