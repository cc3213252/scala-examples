import java.io.{FileNotFoundException, FileReader}

import scala.io.StdIn

object ScalaApp extends App {
//  val x="scala"
//  val result = if (x.length == 5) "true" else "false"
//  print(result)

//  for (n <- 1 until 10){print(n)}
//
//  // 是双重循环
//  for (i <- 1 to 3; j <- 1 to 3) print(f"${10*i + j}%3d")

//  try {
//    val reader = new FileReader("wordCount.txt")
//    println(reader.read())
//  } catch {
//    case ex: FileNotFoundException =>
//      ex.printStackTrace()
//      println("没有找到对应的文件!")
//  } finally {
//    println("finally 语句一定会被执行！")
//  }

//  val elements = Array("A", "B", "C", "D", "E")
//
//  for (elem <- elements) {
//    elem match {
//      case "A" => println(10)
//      case "B" => println(20)
//      case "C" => println(30)
//      case _ => println(50)
//    }
//  }

//  val name = StdIn.readLine("Your name: ")
//  print("Your age: ")
//  val age = StdIn.readInt()
//  println(s"Hello, ${name}! Next year, you will be ${age + 1}.")

//  val nums = List.range(0, 10)
  val nums = (1 to 10 by 2).toList
//  for (num <- nums) println(num)
//  nums.foreach(println)
  nums.filter(_ < 6).foreach(println)
}

