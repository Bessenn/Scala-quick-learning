package com.bessen.chapter11

/**
  * 模式匹配高级用法
  */
object Scala04_Match2 {

    def main(args: Array[String]): Unit = {

        // 匹配规则
        for (arr <- Array(Array(0, 1), List(0, 2), Array(1, 0, 1), List(3), Array(1))) {
            val result = arr match {
                case Array(1, 0, _*) => "这是个以1,0开头的数组"
                case Array(0, 1) => "这是个Array(0,1)"
                case 3 :: Nil => "这是3加空集合的集合"
                case x :: y => "这是个两个元素的集合"
                case _ => "不是我想要的"
            }
            println(s"result =${result}")
        }

        //特殊的模式匹配
        val (a, b) = (1, 2)
        println(s"a = ${a}, b = ${b}")

        val (q, r) = BigInt(10) /% 3
        println(s"q = ${q}, r = ${r}")

        //偏函数
        val list = List(1, 2, 3, 4, "abc")

        val addOne = new PartialFunction[Any, Int] {
            def isDefinedAt(any: Any) = {
                if (any.isInstanceOf[Int]) true
                else false
            }

            def apply(any: Any) = {
                any.asInstanceOf[Int] + 1
            }
        }
        val list1 = list.collect(addOne)
        println(list1)

        val list2 = list.collect{
            case i: Int => i + 1
        }
        println(list2)
    }
}
