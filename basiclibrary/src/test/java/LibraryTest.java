import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
        @Test public void testRollMethod() {
            Library classUnderTest = new Library();
            assertEquals(4, classUnderTest.roll(4).length);
        }

        @Test public void testCalcAverageMethod() {
            Library classUnderTest = new Library();
            int[] averageArrayTest = new int[]{3, 3};
            assertEquals(3, classUnderTest.calcAverage(averageArrayTest));
        }

        @Test public void testContainsDuplicatesMethod() {
            Library classUnderTest = new Library();
            int[] duplicatesArrayTest = new int[]{3, 3, 1};
            assertTrue("if duplicates - TRUE", classUnderTest.containsDuplicates(duplicatesArrayTest));
        }

        @Test public void testLowestArrayAverageMethod() {
//        Library classUnderTest = new Library();
//        assertEquals(,);

        }
}
