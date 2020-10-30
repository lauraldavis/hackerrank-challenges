package dictionariesHashmaps;
import java.util.HashSet;
import java.util.Set;

/* Given two strings, determine if they share a common substring. A substring may be as small as
one character. For example, the words "a", "and", "art" share the common substring a. The words
"be" and "cat" do not share a substring.

Function Description
Complete the function twoStrings in the editor below. It should return a string, either YES or NO
based on whether the strings share a common substring.

twoStrings has the following parameter(s):
    s1, s2: two strings to analyze.

Input Format
The first line contains a single integer p, the number of test cases.
The following p pairs of lines are as follows:
    The first line contains string s1.
The second line contains string s2.

Constraints
s1 and s2 consist of characters in the range ascii[a-z].
1 <= p <= 10
1 <= |s1|, |s2| <= 10**5

Output Format
For each pair of strings, return YES or NO.

Sample Input
2
hello
world
hi
world

Sample Output
YES
NO


 */
public class TwoStrings {

    static String twoStrings(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : c1) {
            set1.add(c);
        }
        for (char c : c2) {
            set2.add(c);
        }
        set1.retainAll(set2);
        if (!set1.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
