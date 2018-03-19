package com.lambdaminute.slinkywrappers.web

import com.lambdaminute.slinkywrappers.semanticui._
import com.lambdaminute.slinkywrappers.web.highlight.{HighlightStyle, SyntaxHighlighter}
import slinky.core.Component
import slinky.core.annotations.react
import slinky.core.facade.ReactElement

@react class CodeSection extends Component {

  case class State(index: Int = -1)
  case class Props(code: String)
  override def initialState             = State()
  private val handleClick: EventHandler = (_, _) => this.setState(s => if (s.index == 0) State(-1) else State(0))
  override def render(): ReactElement =
    Accordion()(
      AccordionTitle(active = state.index == 0, onClick = handleClick)(Icon(name = IconName.`dropdown`),
                                                                       "Show demo source"),
      AccordionContent(active = state.index == 0)(
        SyntaxHighlighter(language = "scala", style = HighlightStyle.hybrid)(props.code)
      )
    )
}
