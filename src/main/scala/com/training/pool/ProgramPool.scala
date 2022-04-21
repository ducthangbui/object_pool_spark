package com.training.pool

import com.training.dao.ProgramDao

case class ProgramPool() {
  private val programDao = ProgramDao()

  lazy val sum = programDao.sum()
}
