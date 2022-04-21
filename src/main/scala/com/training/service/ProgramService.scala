package com.training.service

import com.training.dao.ProgramDao
import com.training.pool.ProgramPool

case class ProgramService() {
  private val programDao = ProgramDao()
  private val programPool = ProgramPool()

  def noPool(): Unit = {
    println("call No Pool Function")
    val sum = programDao.sum()
    println(sum)
  }

  def pool1(): Unit = {
    println("call Pool1 Function")
    val sum = programPool.sum
    println(sum)
  }

  def pool2(): Unit = {
    println("call Pool2 Function")
    val sum = programPool.sum
    println(sum)
  }
}
