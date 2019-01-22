import java.io._


object HelloWorld {
  def main(args:Array[String]){
    val writer = new PrintWriter(new File("test.txt"))
    writer.write("cai niao jiao cheng!")
    writer.close()
  }
}