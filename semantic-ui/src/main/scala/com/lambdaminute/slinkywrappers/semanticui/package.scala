package com.lambdaminute.slinkywrappers

import org.scalajs.dom.Event

import scala.scalajs.js
import slinky.readwrite.Writer

import scala.scalajs.js.|

package object semanticui {
  type EventHandler = js.Function2[Event, js.Dynamic, Unit]

  sealed trait VerticalPosition
  object VerticalPosition {
    case object left  extends VerticalPosition
    case object right extends VerticalPosition
    implicit val writer: Writer[VerticalPosition] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait AttachedVertical
  object AttachedVertical {
    case object top    extends AttachedVertical
    case object bottom extends AttachedVertical
    implicit val writer: Writer[AttachedVertical] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait AttachedHorizontal
  object AttachedHorizontal {
    case object left  extends AttachedHorizontal
    case object right extends AttachedHorizontal
    implicit val writer: Writer[AttachedHorizontal] = _.toString.asInstanceOf[js.Object]
  }

  type Attached = AttachedVertical | AttachedHorizontal

  trait EnumWithWriter {
    implicit val writer: Writer[this.type] = { name =>
      println(s"writing: ${name}")
      name.toString.asInstanceOf[js.Object]
    }
  }

  sealed trait Animated
  object Animated {
    case object fade     extends Animated
    case object vertical extends Animated
    implicit val writer: Writer[Animated] = { name =>
      println(s"writing: ${name}")
      name.toString.asInstanceOf[js.Object]
    }
  }

  sealed trait FloatedVertical
  object FloatedVertical {
    case object left  extends FloatedVertical
    case object right extends FloatedVertical
    implicit val writer: Writer[Animated] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait Color
  object Color {
    case object red    extends Color
    case object orange extends Color
    case object yellow extends Color
    case object olive  extends Color
    case object green  extends Color
    case object teal   extends Color
    case object blue   extends Color
    case object violet extends Color
    case object purple extends Color
    case object pink   extends Color
    case object brown  extends Color
    case object grey   extends Color
    case object black  extends Color
    implicit val writer: Writer[Color] = _.toString.asInstanceOf[js.Object]
  }

  type AnyColor = Color | CompanyColor

  sealed trait CompanyColor
  object CompanyColor {
    case object facebook   extends CompanyColor
    case object googleplus extends CompanyColor
    case object instagram  extends CompanyColor
    case object linkedin   extends CompanyColor
    case object twitter    extends CompanyColor
    case object vk         extends CompanyColor
    case object youtube    extends CompanyColor
    implicit val writer: Writer[CompanyColor] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait Size
  object Size {
    case object mini    extends Size
    case object tiny    extends Size
    case object small   extends Size
    case object medium  extends Size
    case object large   extends Size
    case object big     extends Size
    case object huge    extends Size
    case object massive extends Size
    implicit val writer: Writer[Size] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait Width
  object Width {
    case object `1`        extends Width
    case object `2`        extends Width
    case object `3`        extends Width
    case object `4`        extends Width
    case object `5`        extends Width
    case object `6`        extends Width
    case object `7`        extends Width
    case object `8`        extends Width
    case object `9`        extends Width
    case object `10`       extends Width
    case object `11`       extends Width
    case object `12`       extends Width
    case object `13`       extends Width
    case object `14`       extends Width
    case object `15`       extends Width
    case object `16`       extends Width
    case object `one`      extends Width
    case object `two`      extends Width
    case object `three`    extends Width
    case object `four`     extends Width
    case object `five`     extends Width
    case object `six`      extends Width
    case object `seven`    extends Width
    case object `eight`    extends Width
    case object `nine`     extends Width
    case object `ten`      extends Width
    case object `eleven`   extends Width
    case object `twelve`   extends Width
    case object `thirteen` extends Width
    case object `fourteen` extends Width
    case object `fifteen`  extends Width
    case object `sixteen`  extends Width
    implicit val writer: Writer[Width] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait Flipped
  object Flipped {
    case object horizontal extends Flipped
    case object vertical   extends Flipped
    implicit val writer: Writer[Flipped] = _.toString.asInstanceOf[js.Object]
  }

  sealed trait Rotated
  object Rotated {
    case object horizontal extends Rotated
    case object vertical   extends Rotated
    implicit val writer: Writer[Rotated] = _.toString.asInstanceOf[js.Object]
  }

}
