import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
  
  @Ignore
  public void evaluatesExpression2() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(7, sum);
  }
}
