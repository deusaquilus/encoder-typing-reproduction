package org.deusaquilus

import StaticContext._

class Repo[T]:
  inline def summonEncoder = {
    summonMyEncoder[T]
  }

object Use:
  val repo = new Repo[String]
  val v = repo.summonEncoder
