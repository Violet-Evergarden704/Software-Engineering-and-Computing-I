import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrivateLowHighSwapTest {

    private final LowHighSwap lowHighSwap = new LowHighSwap();

    @Test
    public void test4(){
        int[] array = new int[]{1,2,3,4,5};
        assertTrue("12345".equals(array2String(lowHighSwap.swap(array))));
    }

    @Test
    public void test5(){
        int[] array = new int[]{10,6,7,8,4,3,1,2,5,9};
        assertTrue("95213487610".equals(array2String(lowHighSwap.swap(array))));
    }

    @Test
    public void test6(){
        int[] array = new int[]{5};
        assertTrue("5".equals(array2String(lowHighSwap.swap(array))));
    }

    @Test
    public void test7(){
        int[] array = new int[]{121,2,32,41,5};
        assertTrue("523241121".equals(array2String(lowHighSwap.swap(array))));
    }

    @Test
    public void test8(){
        int[] array = new int[]{10,6,7,8,4,3,1,2,5,9,12,21};
        assertTrue("106752134891221".equals(array2String(lowHighSwap.swap(array))));
    }

    @Test
    public void test9(){
        int[] array = new int[]{12,3,4,5};
        assertTrue("53412".equals(array2String(lowHighSwap.swap(array))));
    }

    @Test
    public void test10(){
        int[] array = new int[]{12,3,45,6};
        assertTrue("634512".equals(array2String(lowHighSwap.swap(array))));
    }

    private String array2String(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int n:array){
            sb.append(n);
        }
        return sb.toString();
    }
}
