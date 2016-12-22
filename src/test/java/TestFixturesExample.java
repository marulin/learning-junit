import java.io.Closeable;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * A test fixture is a fixed state of a set of objects used as a baseline for running tests. The
 * purpose of a test fixture is to ensure that there is a well known and fixed environment in which
 * tests are run so that results are repeatable. Examples of fixtures:
 * 
 * Preparation of input data and setup/creation of fake or mock objects Loading a database with a
 * specific, known set of data Copying a specific known set of files creating a test fixture will
 * create a set of objects initialized to certain states. JUnit provides annotations so that test
 * classes can have fixture run before or after every test, or one time fixtures that run before and
 * after only once for all test methods in a class.
 * 
 * There are four fixture annotations: two for class-level fixtures and two for method-level ones.
 * At the class level, you have @BeforeClass and @AfterClass, and at the method (or test) level, you
 * have @Before and @After.
 * 
 * @author rollin
 *
 */
public class TestFixturesExample {
  static class ExpensiveManagedResource implements Closeable {
    @Override
    public void close() throws IOException {}
  }

  static class ManagedResource implements Closeable {
    @Override
    public void close() throws IOException {}
  }

  @BeforeClass
  public static void setUpClass() {
    System.out.println("@BeforeClass setUpClass");
    myExpensiveManagedResource = new ExpensiveManagedResource();
  }

  @AfterClass
  public static void tearDownClass() throws IOException {
    System.out.println("@AfterClass tearDownClass");
    myExpensiveManagedResource.close();
    myExpensiveManagedResource = null;
  }

  private ManagedResource myManagedResource;
  private static ExpensiveManagedResource myExpensiveManagedResource;

  private void println(String string) {
    System.out.println(string);
  }

  @Before
  public void setUp() {
    this.println("@Before setUp");
    this.myManagedResource = new ManagedResource();
  }

  @After
  public void tearDown() throws IOException {
    this.println("@After tearDown");
    this.myManagedResource.close();
    this.myManagedResource = null;
  }

  @Test
  public void test1() {
    this.println("@Test test1()");
  }

  @Test
  public void test2() {
    this.println("@Test test2()");
  }
}
