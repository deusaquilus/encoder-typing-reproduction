package org.deusaquilus

import scala.quoted._

object SummonEncoder:
  def impl[T: Type](using Quotes) =
    import quotes.reflect._
    Expr.summon[MyEncoder[T]] match
      case Some(enc) => '{ $enc.encode }
      case None      => report.throwError("can't do it")