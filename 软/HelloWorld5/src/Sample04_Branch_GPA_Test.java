import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sample04_Branch_GPA_Test {
    @Test
    public void testGPA(){
        double gpa = Sample04_Branch_GPA.calculateGPA(100,100,100);
        assertEquals(100.0,gpa);
    }
}
