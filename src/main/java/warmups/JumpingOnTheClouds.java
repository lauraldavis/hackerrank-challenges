package warmups;

/*
Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2. She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting position to the last cloud. It is always possible to win the game.

For each game, Emma will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided. For example, c=[0,1,0,0,0,1,0] indexed from 0...6. The number on each cloud is its index in the list so she must avoid the clouds at indexes 1 and 5. She could follow the following two paths: 0->2->4->6 or 0->2->3->4->6. The first path takes 3 jumps while the second takes 4.

Function Description
Complete the jumpingOnClouds function in the editor below. It should return the minimum number of jumps required, as an integer.

jumpingOnClouds has the following parameter(s):
c: an array of binary integers

Input Format

The first line contains an integer n, the total number of clouds. The second line contains n space-separated binary integers describing clouds c[i] where 0 <= i < n.

Constraints:
2 <= n <= 100
c[i] is an element of {0,1}
c[0] = c[n-1] = 0
Output Format: Print the minimum number of jumps needed to win the game.

Sample Input 0:
7
0 0 1 0 0 1 0
Sample Output 0:
4
Explanation 0:
Emma must avoid c[2] and c[5]. She can win the game with a minimum of 4 jumps:
 */
public class JumpingOnTheClouds {

    static int jumpingOnTheClouds(int[] c) {
        int jumps = 0;
        int i = 0;

//        Use a while loop when you want to increment by different amounts
        while (i < c.length-1) {
            if (i+2 == c.length || c[i + 2] == 1) {
                i++;
                jumps++;
            } else {
                i += 2;
                jumps++;
            }
        }
        return jumps;
    }
}
