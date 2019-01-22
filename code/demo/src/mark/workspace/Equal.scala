package mark.workspace

trait Equal {
  def isEqual(x:Any):Boolean
  def isNotEqual(x:Any):Boolean = !isEqual(x)
}



class MyPoint(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
    obj.asInstanceOf[Point].x == x
}

object MyTest {
   def main(args: Array[String]) {
      val p1 = new MyPoint(2, 3)
      val p2 = new MyPoint(2, 4)
      val p3 = new MyPoint(3, 3)

      println(p1.isNotEqual(p2))
      println(p1.isNotEqual(p3))
      println(p1.isNotEqual(2))
   }
}