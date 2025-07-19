import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sample03_Recursion_ClimbStairs_Test {

        @Test
        public void testCase1() {
            Sample03_Recursion_ClimbStairs climbStairs = new Sample03_Recursion_ClimbStairs();
            int n = 2;
            int expected = 2;
            int actual = climbStairs.methodsQuanity(n);
            assertEquals(expected, actual);
        }

        @Test
        public void testCase2() {
            Sample03_Recursion_ClimbStairs climbStairs = new Sample03_Recursion_ClimbStairs();
            int n = 3;
            int expected = 3;
            int actual = climbStairs.methodsQuanity(n);
            assertEquals(expected, actual);
        }

        @Test
        public void testCase3() {
            Sample03_Recursion_ClimbStairs climbStairs = new Sample03_Recursion_ClimbStairs();
            int n = 4;
            int expected = 5;
            int actual = climbStairs.methodsQuanity(n);
            assertEquals(expected, actual);
        }

        // Add more test cases
        @Test
        public void testCase4() {
            Sample03_Recursion_ClimbStairs climbStairs = new Sample03_Recursion_ClimbStairs();
            int n = 5;
            int expected = 8;
            int actual = climbStairs.methodsQuanity(n);
            assertEquals(expected, actual);
        }

        @Test
        public void testCase5() {
            Sample03_Recursion_ClimbStairs climbStairs = new Sample03_Recursion_ClimbStairs();
            int n = 6;
            int expected = 13;
            int actual = climbStairs.methodsQuanity(n);
            assertEquals(expected, actual);
        }

        @Test
        public void testCase6() {
            Sample03_Recursion_ClimbStairs climbStairs = new Sample03_Recursion_ClimbStairs();
            int n = 7;
            int expected = 21;
            int actual = climbStairs.methodsQuanity(n);
            assertEquals(expected, actual);
        }

        @Test
        public void testCase7() {
            Sample03_Recursion_ClimbStairs climbStairs = new Sample03_Recursion_ClimbStairs();
            int n = 8;
            int expected = 34;
            int actual = climbStairs.methodsQuanity(n);
            assertEquals(expected, actual);
        }

}
