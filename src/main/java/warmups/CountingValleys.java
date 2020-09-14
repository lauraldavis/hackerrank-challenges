package warmups;

//Same problem as robot returns to origin on Leetcode

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int altitude = 0;
        int num_valleys = 0;

        for (int i=0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                if (altitude == -1) {
                    num_valleys++;
                }
                altitude++;
            }
            if (s.charAt(i) == 'D') {
                altitude--;
            }
        }
        return num_valleys;
    }
}
