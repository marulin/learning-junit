import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  AssertTests.class,
  Calculator.class,
  TestExy.class,
  TestMethodOrder.class
})

public class FeatureTestSuite {
  // the class remains empty,
  // used only as a holder for the above annotations
}