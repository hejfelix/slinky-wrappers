package com.lambdaminute.slinkywrappers.macros
import scala.reflect.macros.blackbox
import scala.language.experimental.macros

object Macros {
  def sourceAsString: String = macro get_source_impl
  def get_source_impl(c: blackbox.Context): c.Expr[String] = {
    import c.universe._
    val fileAsString  = String.valueOf(c.enclosingPosition.source.content)
    val stringLiteral = Literal(Constant(fileAsString))
    c.Expr(stringLiteral)
  }
}
