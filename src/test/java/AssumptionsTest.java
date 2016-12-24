import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.*;

@FixMethodOrder(MethodSorters.JVM)
public class AssumptionsTest {

  @Test
  public void testA() {
    assertTrue("failure - should be true", true);
  }

  @Ignore
  @Test
  public void texitIfFalseIsTrue() {
    assumeTrue(false);
    System.exit(1);
  }
  
  @Test
  public void testxt() {
    assertTrue("failure - should be true", true);
  }

}
