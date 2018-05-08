import ScalaExercises.LexicalScopes
import org.scalatest.FunSuite

class ExercisesTest extends FunSuite {
  test("Lexical scopes sqrt") {
    val res = LexicalScopes.sqrt(9.0)
    assert(res - (res % 3) == 3.0)
  }
}
