import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * If for some reason, you don't want a test to fail, you just want it ignored, you temporarily
 * disable a test.
 * 
 * To ignore a test in JUnit you can either comment a method, or delete the @Test annotation; but
 * the test runner will not report such a test. Alternatively, you can add the @Ignore annotation in
 * front or after @Test. Test runners will report the number of ignored tests, along with the number
 * of tests that ran and the number of tests that failed.
 * 
 * Note that @Ignore takes an optional parameter (a String) if you want to record a reason why a
 * test is being ignored.
 * 
 * @author rollin
 *
 */
public class IgnoreTest {
  @Ignore("Test is ignored as a demonstration")
  @Test
  public void testSame() {
    assertThat(1, is(1));
  }
}
