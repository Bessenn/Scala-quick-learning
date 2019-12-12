package com.bessen.chapter06_07_08

// scala中如果想要从最开始的包中查找类,需要增加绝对路径,使用_root_开头
import _root_.java.util._

// /*
package java {

    package util {

        class HashMap {
        }

        object Scala05_Import1 {

            def main(args: Array[String]): Unit = {

                //使用前面的HashMap
                //val map = new java.util.HashMap
                //使用全路径下的HashMap
                val map = new _root_.java.util.HashMap
                println(map)
            }
        }

    }

}

// */

