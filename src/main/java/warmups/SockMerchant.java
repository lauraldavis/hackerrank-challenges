package warmups;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        // solution passed & [O(N)], preferable to double for loop
        int pairs = 0;
        if (ar.length == 0) return pairs;

        Set<Integer> set = new HashSet();
        for (int i=0; i < ar.length; i++) {
            if (set.contains(ar[i])) {
                set.remove(ar[i]);
                pairs++;
            } else {
                set.add(ar[i]);
            }
        }
        return pairs;
    }
}
