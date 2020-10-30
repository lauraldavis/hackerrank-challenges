package dictionariesHashmaps;

import java.util.HashMap;
import java.util.Map;

/*
Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him
through his handwriting. He found a magazine and wants to know if he can cut out whole words from
it and use them to create an untraceable replica of his ransom note. The words in his note are
case-sensitive and he must use only whole words available in the magazine. He cannot use substrings
or concatenation to create the words he needs.
Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his
ransom note exactly using whole words from the magazine; otherwise, print No.
For example, the note is "Attack at dawn". The magazine contains only "attack at dawn". The magazine
has all the right words, but there's a case mismatch. The answer is No.

Function Description
Complete the checkMagazine function in the editor below. It must print Yes if the note can be formed
using the magazine, or No.

checkMagazine has the following parameters:
    magazine: an array of strings, each a word in the magazine
    note: an array of strings, each a word in the ransom note

Input Format
The first line contains two space-separated integers, m and n, the numbers of words in the magazine
and the note.
The second line contains m space-separated strings, each magazine[i].
The third line contains n space-separated strings, each note[i].

Constraints
1 <= m,n <= 30000
1 <= |magazine[i]|, |note[i]| <= 5.
Each word consists of English alphabetic letters (i.e., a to z and A to Z).

Output Format
Print Yes if he can use the magazine to create an untraceable replica of his ransom note.
Otherwise, print No.

Sample Input 0
6 4
give me one grand today night
give one grand today

Sample Output 0
Yes

Sample Input 1
6 5
two times three is not four
two times two is four

Sample Output 1
No

Explanation 1
'two' only occurs once in the magazine.

Sample Input 2
7 4
ive got a lovely bunch of coconuts
ive got some coconuts

Sample Output 2
No

Explanation 2
Harold's magazine is missing the word some.
 */
public class RansomNote {
    static String checkMagazine(String[] magazine, String[] note) {
        if ((magazine.length == 0 || note.length == 0) || (magazine.length > 30000 || note.length > 30000)) {
//            System.out.println("No");
            return "No";
        }
        Map<String, Integer> magazineWords = new HashMap<>();
        // iterate through magazine
        for (int i = 0; i < magazine.length; i++) {
            if (magazineWords.get(magazine[i]) != null) {
                int count = magazineWords.get(magazine[i]);
                magazineWords.put(magazine[i], ++count);
                // key: word, value: count of #times word appears
            } else {
                magazineWords.put(magazine[i], 1);
            }
        }
        // iterate through ransom note
        for (int j = 0; j < note.length; j++) {
            if (magazineWords.get(note[j]) == null) {
//                System.out.println("No");
                return "No";
            } else if (magazineWords.get(note[j]) != null) {
                // get value (count) for key (word) from magazine hashmap
                int count = magazineWords.get(note[j]);
                if (magazineWords.get(note[j]) > 0) {
                    // decrement the hashmap value (count) for each word matched in the note
                    magazineWords.put(note[j], --count);
                } else {
                    // if the value (count) has already been depleted, the magazine doesn't have enough words
//                    System.out.println("No");
                    return "No";
                }
            }
        }
//        System.out.println("Yes");
        return "Yes";
    }
}
