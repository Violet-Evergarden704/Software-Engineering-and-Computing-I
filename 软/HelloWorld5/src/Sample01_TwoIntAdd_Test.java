import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sample01_TwoIntAdd_Test {

    @Test
    public void testJava() {

        int i = Sample01_TwoIntAdd.add(100, 34);

        assertEquals(134, i);

    }

}
