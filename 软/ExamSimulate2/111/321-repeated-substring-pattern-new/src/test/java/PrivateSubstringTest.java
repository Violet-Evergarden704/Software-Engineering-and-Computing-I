
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrivateSubstringTest {
    private final substring substring = new substring();

    @Test
    public void test111() {
        assertEquals(substring.repeatedSubstringPattern("aaaaa"), true);
    }

    @Test
    public void test1151() {
        assertEquals(substring.repeatedSubstringPattern("abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy"), true);
    }

    @Test
    public void test110() {
        assertEquals(substring.repeatedSubstringPattern("ababcababcababcababcababcababcababcababcababcababcababc"), true);
    }

    @Test
    public void test115() {
        assertEquals(substring.repeatedSubstringPattern("abcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcde"), false);
    }

    @Test
    public void test120() {
        assertEquals(substring.repeatedSubstringPattern("abcdefgabcdefgabcdefgabcdefgabcdefgabcdefgabcdefgabcdef"), false);
    }
}