package com.bessen.chapter03

/**
  * 测试运算符
  */
object Scala01_Oper {

    def main(args: Array[String]): Unit = {

        var i = 1
        var b = 10

        //TODO scala中没有++运算符
        //i++  //error
        i += 1
        println(i)


        // 所有的scala表达式都有结果
        println(b = 10) //Unit  ()

        /*if (b) {
          println("true")
        }*/

    }
}
