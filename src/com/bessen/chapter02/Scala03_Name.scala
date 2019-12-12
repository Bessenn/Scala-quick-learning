package com.bessen.chapter02

/**
  * 测试标识符
  * Scala取名可以以（+-*除#)开头，例如把变量命名为+-
  */
object Scala03_Name {
    def main(args: Array[String]): Unit = {

        // 首字符为操作符(比如+ - * / )，后续字符也需跟操作符 ,至少一个(反编译)
        // scala中可以使用特殊符号作为标识符,其实是将特殊符号在编译时进行了转换
        val +-*/ = 123
        println(+-*/)

        val %@# = true
        println(%@#)

        // scala中的下划线_有特殊的用途,不能独立当成变量名来使用
        val _ = "123"
        val a = "abc" + _

        println(a) //输出com.bessen.chapter02.Scala03_Name$$$Lambda$5/10791211@5a99da

        // 用反引号`....`包括的任意字符串，即使是关键字(39个)也可以作为标识符

        val `private` = 123

        println(`private`)


    }
}
