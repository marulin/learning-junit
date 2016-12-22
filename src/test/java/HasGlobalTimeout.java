import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HasGlobalTimeout {
  public static String log;
  private final CountDownLatch latch = new CountDownLatch(1);

  @Rule
  public Timeout globalTimeout = Timeout.seconds(10); // 10 seconds max per method tested

  @Test(timeout = 10000)
  public void testSleepForTooLong() throws Exception {
    log += "ran1";
    TimeUnit.SECONDS.sleep(5); // sleep for 5 seconds
  }

  @Test(timeout = 1000)
  public void testBlockForever() throws Exception {
    log += "ran2";
    latch.await(); // will block
  }
}
