package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react
import slinky.readwrite.Writer

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, |}
import concurrent.duration.FiniteDuration
import js.Dynamic.literal

object TransitionDuration{
  implicit val writer: Writer[TransitionDuration] = (t: TransitionDuration) => {
    val enter = t.enter.map(_.toMillis)
    val value = literal(enter = t.enter.map(_.toMillis), exit = t.exit.map(_.toMillis))
    println(s"Transition value: $value")
    value
  }
}
case class TransitionDuration(enter: UndefOr[FiniteDuration] = js.undefined, exit:UndefOr[FiniteDuration] = js.undefined)

sealed trait Variant
object Variant extends Variant with EnumWriter {
  case object permanent extends Variant
  case object persistent extends Variant
  case object temporary extends Variant
}

@react object Drawer extends ExternalComponent {
  case class Props( anchor: UndefOr[Anchor] = js.undefined,
                    elevation: UndefOr[Int] = js.undefined,
                    ModalProps:UndefOr[js.Object] = js.undefined,
                    onClose: UndefOr[js.Function] = js.undefined,
                    open: UndefOr[Boolean] = js.undefined,
                    PaperProps: UndefOr[js.Object] = js.undefined,
                    SlideProps: UndefOr[js.Object] = js.undefined,
                    transitionDuration: UndefOr[Int | TransitionDuration] = js.undefined,
                    variant: UndefOr[Variant] = js.undefined)
  override val component = MaterialUi.Drawer
}