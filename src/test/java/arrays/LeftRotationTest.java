package arrays;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class LeftRotationTest {

    @Test
    public void testLeftRotation() {
        String r1 = "1 2 3 4 5";
        int[] ar1 = Arrays.stream(r1.split("\\s")).mapToInt(Integer::parseInt).toArray();
        int n1 = 4;
        int[] testSet1 = LeftRotation.rotLeft(ar1, n1);
        int[] expect1 = {5, 1, 2, 3, 4};
        assertArrayEquals(expect1, testSet1);

        String r2 = "1 2 3 4 5";
        int[] ar2 = Arrays.stream(r2.split("\\s")).mapToInt(Integer::parseInt).toArray();
        int n2 = 2;
        int[] testSet2 = LeftRotation.rotLeft(ar2, n2);
        int[] expect2 = {3, 4, 5, 1, 2};
        assertArrayEquals(expect2, testSet2);

    }

}
