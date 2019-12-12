package com.bessen.chapter12


object Scala01_ {

    /**
      * 测试泛型（协变、逆变用法等）
      *
      * @param args
      */
    def main(args: Array[String]): Unit = {

        /*
        Java1.5版本从Pizza语言中引入了泛型的语法，而Scala和Pizza都是同一个作者开发的，
        因此，Java和Scala的泛型基本是一样的，甚至Scala的泛型比Java更加丰富一些。
         */
        // 泛型是对类型的一种约束，具有不变性的特点，
        // 创建对象和声明对象时指定的泛型必须保持一致，但是在实际使用时其实是允许多态的。
        // 另外，Java中的泛型约束的作用范围只在约束的对象起作用，
        // 在赋值的过程中容易产生bug，例如：

        /*List list = new util.ArrayList();
        list.add(new Integer(1));
        List<String> stringList = list; // 不报错
        System.out.println(stringList.get(0)); // 报错
        */

        //Scala可以在函数定义时使用泛型

        test1[Student](new Student)
        test2[I18nStudent](new I18nStudent)

        //测试协变（可以用Student子类）
        val t1: Test1[Student] = new Test1[I18nStudent]

        //测试逆变（可以用Student父类）
        val t2: Test2[Student] = new Test2[Person]

    }

    //一般泛型定义
    def test1[T](t: T): Unit = {

    }

    //泛型约束范围为Student及其子类
    def test2[T <: Student](t: T): Unit = {

    }

    class Person {

    }

    class Student extends Person {

    }

    class I18nStudent extends Student {

    }

    //+表示协变，在创建对象时可以用其他类（子类）作为泛型
    class Test1[+Student] {

    }

    //-表示逆变，在创建对象时可以用其他类（父类）作为泛型
    class Test2[-Student] {

    }

}
