package com.bessen.chapter01

/**
  * 测试打印字符串
  */
object Scala02_TestString {

    def main(args: Array[String]): Unit = {

        //变量声明
        val name = "Bessen"
        val age = 80
        val url = "www.bessen.com"

        //字符串通过+号连接（类似java）
        println("name=" + name + " age=" + age + " url=" + url)

        //printf用法:字符串通过 % 传值，类似于C语言。
        printf("name=%s, age=%d, url=%s \n", name, age, url)

        //插值字符串:字符串通过$引用，类似于jQuery
        println(s"name=${name}, age=$age, url=$url")

        //字符串前加f格式化变量
        println(f"name=${name}, age=${age}%.2f, url=$url")

        //raw得到原始的值，不识别\n
        print(raw"name=${name}, age=${age}%.2f, url=$url \n")

        //单行注释
        /*
          多行注释
         */
        /**
          * doc注释
          */
    }
}
