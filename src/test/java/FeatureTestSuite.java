import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * The class below is a placeholder for the suite annotations, no other implementation is required.
 * Note the @RunWith annotation, which specifies that the JUnit 4 test runner to use is
 * org.junit.runners.Suite for running this particular test class. This works in conjunction with
 * the @Suite annotation, which tells the Suite runner which test classes to include in this suite
 * and in which order.
 * 
 * @author rollin
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({AssertTests.class, CalculatorTest.class})
public class FeatureTestSuite {
  // the class remains empty,
  // used only as a holder for the above annotations
}
