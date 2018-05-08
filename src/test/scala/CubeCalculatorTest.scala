import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator test") {
    assert(CubeCalculator.cube(3) === 27)
  }
  test("CubeCalculator mask with default param") {
    assert(CubeCalculator.maskLastIpOctet("123.123.123.123") == "123.123.123.x")
  }

  test("CubeCalculator mask") {
    assert(CubeCalculator.maskLastIpOctet("123.123.123.123", "foo") == "123.123.123.foo")
  }
}
