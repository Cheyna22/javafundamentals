/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testRollMethod() {
        Library classUnderTest = new Library();
        assertEquals(4, classUnderTest.roll(4).length);
    }

//    @Test public void testContainsDuplicatesMethod() {
//        Library classUnderTest = new Library();
//        assertTrue("if array contains duplicates return 'true'", classUnderTest.containsDuplicates());
//    }
}
