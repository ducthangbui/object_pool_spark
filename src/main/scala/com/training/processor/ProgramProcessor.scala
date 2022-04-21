package com.training.processor

import com.training.App
import org.apache.spark.sql.DataFrame

case class ProgramProcessor() {
  private val spark = App.spark

  def loadData(): DataFrame = {
    import spark.implicits._
    val columns = Seq("language","users_count")
    val data = Seq(("Java", "20000"), ("Python", "100000"), ("Scala", "3000"))
    val rdd = spark.sparkContext.parallelize(data)
    val df = rdd.toDF(columns:_*)
    df
  }
}
