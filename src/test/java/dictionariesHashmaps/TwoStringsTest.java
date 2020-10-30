package dictionariesHashmaps;
import org.junit.Test;
import static org.junit.Assert.*;

public class TwoStringsTest {

    @Test
    public void testTwoStrings() {
        String s1 = "hello";
        String s2 = "world";
        String testSet1 = TwoStrings.twoStrings(s1, s2);
        String expect1 = "YES";
        assertSame(expect1, testSet1);

        String s3 = "hi";
        String s4 = "world";
        String testSet2 = TwoStrings.twoStrings(s3, s4);
        String expect2 = "NO";
        assertSame(expect2, testSet2);

    }
}
