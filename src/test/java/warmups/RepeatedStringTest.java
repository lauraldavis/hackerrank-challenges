package warmups;

import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void testRepeatedString() {
        String s1 = "aba";
        long n1 = 10;
        long testSet1 = RepeatedString.repeatedString(s1, n1);
        assertEquals(7, testSet1);

        String s2 = "a";
        long n2 = 1000000000000L;
        long testSet2 = RepeatedString.repeatedString(s2, n2);
        assertEquals(1000000000000L, testSet2);
    }

}
