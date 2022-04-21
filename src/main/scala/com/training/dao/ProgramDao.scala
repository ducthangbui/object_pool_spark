package com.training.dao

import com.training.processor.ProgramProcessor
import org.apache.spark.sql.functions.{array, asc, avg, col, desc, lit}

case class ProgramDao() {
  private val programProcessor = ProgramProcessor()

  def sum(): Long = {
    println("Call sum function")
    val df = programProcessor.loadData()
    df.count()
  }
}
