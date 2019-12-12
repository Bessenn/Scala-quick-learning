package com.bessen.chapter03

/**
  * 测试控制台输入
  */

import scala.io.StdIn


object Scala03_In {

    def main(args: Array[String]): Unit = {

        print("input:")
        val line: String = StdIn.readLine()
        println("line = " + line)
    }
}
