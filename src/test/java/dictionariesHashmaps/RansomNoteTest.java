package dictionariesHashmaps;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class RansomNoteTest {

    @Test
    public void testRansomNote() {
        String s1 = "give me one grand today night";
        String s2 = "give one grand today";
        String testSet1 = RansomNote.checkMagazine(s1.split(" "), s2.split(" "));
        String expect1 = "Yes";
        assertSame(expect1, testSet1);

        String s3 = "two times three is not four";
        String s4 = "two times two is four";
        String testSet2 = RansomNote.checkMagazine(s3.split(" "), s4.split(" "));
        String expect2 = "No";
        assertSame(expect2, testSet2);

        String s5 = "ive got a lovely bunch of coconuts";
        String s6 = "ive got some coconuts";
        String testSet3 = RansomNote.checkMagazine(s5.split(" "), s6.split(" "));
        String expect3 = "No";
        assertSame(expect3, testSet3);

    }
}
