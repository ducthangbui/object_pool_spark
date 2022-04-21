package com.training

import com.training.service.ProgramService
import org.apache.spark.sql.SparkSession

object App {
  val spark:SparkSession = SparkSession.builder()
    .master("local[*]").appName("Object Pool Training")
    .getOrCreate()

  def main(args: Array[String]): Unit = {
    spark.sparkContext.setLogLevel("ERROR")

    val programService = ProgramService()
    println("Start call No Pool")
    programService.noPool()
    programService.noPool()
    println("#######################")
    println("Start call Pool")
    programService.pool1()
    programService.pool2()
  }
}
