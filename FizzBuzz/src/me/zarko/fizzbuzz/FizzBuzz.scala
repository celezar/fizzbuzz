package me.zarko.fizzbuzz

object FizzBuzz {

  def main(args: Array[String]): Unit = {
    
    var arrayRepl = Array[(Int, String)](
      (3, "Fizz"),
      (5, "Buzz"));
    
    (1 to 100) foreach { x: Int =>
      var modified: Boolean = false;
      var print: String = x toString;
      arrayRepl foreach { m: (Int, String) =>
        if (x % m._1 == 0){
          print = if (modified) print + m._2 else m._2;
          modified = true;
        }
      }
      println(print)
    }
  }
}