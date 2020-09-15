package warmups;

/*
A hiker keeps records of their hikes. For every step it is noted as an uphill, U, or a downhill, D step. Hikes always start and end at sea level, and each step up or down represents a 1 unit change in altitude. We define the following terms:
A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.

Example: steps = 8, path = [DDUUUUDD]
The hiker first enters a valley 2 units deep. Then they climb out and up onto a mountain 2 units high. Finally, the hiker returns to sea level and ends the hike.

Function Description
Complete the countingValleys function in the editor below.
countingValleys has the following parameter(s):
int steps: the number of steps on the hike
string path: a string describing the path
 */
// Same problem as "robot returns to origin" on Leetcode

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
