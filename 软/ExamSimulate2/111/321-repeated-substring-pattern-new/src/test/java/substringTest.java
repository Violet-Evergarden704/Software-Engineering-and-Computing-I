
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class substringTest {
    private final substring substring = new substring();

    @Test
    public void test1() {
        assertEquals(substring.repeatedSubstringPattern("abab"), true);
    }

    @Test
    public void test5() {
        assertEquals(substring.repeatedSubstringPattern("abcabcabc"), true);
    }

    @Test
    public void test10() {
        assertEquals(substring.repeatedSubstringPattern("aaaaa"), true);
    }

    @Test
    public void test15() {
        assertEquals(substring.repeatedSubstringPattern("abcd"), false);
    }

    @Test
    public void test20() {
        assertEquals(substring.repeatedSubstringPattern("abcdeabcde"), true);
    }
}