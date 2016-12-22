import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class IgnoreTest {
  @Ignore("Test is ignored as a demonstration")
  @Test
  public void testSame() {
    assertThat(1, is(1));
  }
}
