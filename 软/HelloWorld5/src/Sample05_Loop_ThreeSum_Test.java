
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Sample05_Loop_ThreeSum_Test {

    @Test
    public void testThreeSumA() {
        assertArrayEquals( Sample05_Loop_ThreeSum.threeSum(new int[]{2, 7, 11, 15}, 20),new int[]{0, 1, 2});
    }

    @Test
    public void testThreeSumB() {
        assertArrayEquals(Sample05_Loop_ThreeSum.threeSum(new int[]{7, 3, 5, 1}, 13),new int[]{0, 2, 3});
    }

    @Test
    public void testThreeSumC() {
        assertArrayEquals(Sample05_Loop_ThreeSum.threeSum(new int[]{9, 8, 5, 1}, 14),new int[]{1, 2, 3});
    }
}
