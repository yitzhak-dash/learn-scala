object CubeCalculator{
  def cube(x: Int) = {
    x * x * x
  }

  def maskLastIpOctet(ip: String, mask: String = "x") = {
    //    val arr = ip.split('.')
    //    if (arr.length == 4) arr.updated(3, valToMask).mkString(".")
    //    else ip

    val lastIndex = ip.lastIndexOf('.');
    if (lastIndex > 0) ip.substring(0, lastIndex) ++ "." ++ mask
    else ip
  }

  println(maskLastIpOctet("123.123.123.123"))
}
