import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class AdditionWithTheoriesTest {

  @DataPoints
  public static int[] positiveIntegers() {
    return new int[] {1, 10, 1234567};
  }

  @Theory
  public void a_plus_b_is_greater_than_a_and_greater_than_b(Integer a, Integer b) {
    assertTrue(a + b > a);
    assertTrue(a + b > b);
  }
  
  @Theory
  public void addition_is_commutative(Integer a, Integer b) {
     assertTrue(a + b == b + a);
  }
}
