import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sample03_Recurrsion_ReverseString_Test {

    @Test
    public void testReverse(){
        String s = Sample03_Recurrsion_ReverseString.reverse("abcde");

        assertEquals("edcba",s);
    }
    @Test
    public void testReverse2(){
        String s = Sample03_Recurrsion_ReverseString.reverse("asdfghjkl");

        assertEquals("lkjhgfdsa",s);
    }
    @Test
    public void testBin2Dec(){
        int d = Sample03_Recurrsion_ReverseString.bin2dec("110");

        assertEquals(6,d);
    }
    @Test
    public void testBin2Dec2(){
        int d = Sample03_Recurrsion_ReverseString.bin2dec("10110");

        assertEquals(22,d);
    }
}
