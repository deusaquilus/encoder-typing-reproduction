package org.deusaquilus

class Repo[T]:
  val ctx = new Context
  inline def summonEncoder = { import ctx._ // change to: import ctx.{given, _} for the given example
    summonMyEncoder[T]
  }

object Use:
  val repo = new Repo[String]
  val v = repo.summonEncoder