import static org.easymock.EasyMock.*;
import org.easymock.*;
import org.junit.*;

public class ExampleTest extends EasyMockSupport {

    @Rule
    public EasyMockRule rule = new EasyMockRule(this);

    @Mock
    private Collaborator collaborator; // 1

    @TestSubject
    private ClassTested classUnderTest = new ClassTested(); // 2

    @Test
    public void addDocument() {
        collaborator.documentAdded("New Document"); // 3
        replayAll(); // 4
        classUnderTest.addDocument("New Document", "content"); // 5
        // verifyAll(); // 6
    }
}