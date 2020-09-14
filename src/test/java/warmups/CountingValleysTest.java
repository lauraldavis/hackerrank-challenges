package warmups;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountingValleysTest {

    @Test
    public void testCountingValleys() {
        int n1 = 8;
        String s1 = "UDDDUDUU";
        int testSet1 = CountingValleys.countingValleys(n1, s1);
        assertEquals(1, testSet1);

        int n2 = 12;
        String s2 = "DDUUDDUDUUUD";
        int testSet2 = CountingValleys.countingValleys(n2, s2);
        assertEquals(2, testSet2);
    }

}
