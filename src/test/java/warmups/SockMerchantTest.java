package warmups;

import org.junit.Test;
import static org.junit.Assert.*;

public class SockMerchantTest {

    @Test
    public void testSockMerchant() {
        int n1 = 9;
        int[] ar1 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int testSet1 = SockMerchant.sockMerchant(n1, ar1);
        assertEquals(3, testSet1);

        int n2 = 10;
        int[] ar2 = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int testSet2 = SockMerchant.sockMerchant(n2, ar2);
        assertEquals(4, testSet2);
    }
}
