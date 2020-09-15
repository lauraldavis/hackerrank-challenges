package warmups;

import org.junit.Test;
import static org.junit.Assert.*;

public class JumpingOnTheCloudsTest {

    @Test
    public void testJumpingOnTheClouds() {
        int[] a1 = {0,0,1,0,0,1,0};
        int testSet1 = JumpingOnTheClouds.jumpingOnTheClouds(a1);
        assertEquals(4, testSet1);

        int[] a2 = {0,0,0,0,1,0};
        int testSet2 = JumpingOnTheClouds.jumpingOnTheClouds(a2);
        assertEquals(3, testSet2);
    }
}
