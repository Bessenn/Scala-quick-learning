package com.bessen.chapter02

/**
  * 变量
  */
object Scala01_Var {

    // TODO 在方法的外部声明的变量如果采用val关键字,等同于使用final修饰
    val sex: String = "男"

    def main(args: Array[String]): Unit = {

        // java局部变量
        // int i = 10;


        // scala声明变量
        //  TODO var 变量名称 : 变量类型 = 变量的值
        // var name: String = "zhangsan"

        //  TODO scala声明变量必须显式的初始化
        // var name:String
        // name="zhangsan"

        // TODO 使用var声明的变量的值是可以修改的
        var age: Int = 10

        var c: Char = 'C'

        var b: Boolean = true

        //  TODO 使用val声明的变量的值无法修改
        val name: String = "zhangsan"


        //  TODO scala为了让开发过程变得简单,可以将自动推断出来的内容省略
        val name2 = "lisi"

        val dog = new Dog()
        dog.name = "mydog"
        // TODO var修饰的对象引用可以改变，val 修饰的则不可改变，但对象的状态(值)却是可以改变的。(比如: 自定义对象、数组、集合等等)
        println(dog.name)

    }
}

class Dog {
    var name: String = ""
}