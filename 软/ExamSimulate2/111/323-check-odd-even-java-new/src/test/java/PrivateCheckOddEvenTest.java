import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PrivateCheckOddEvenTest {
	@Test
	public void testSingle8() {
		assertEquals(true, CheckOddEven.isOdd(-1));
	}
	
	@Test
	public void testSingle9() {
		assertEquals(true, CheckOddEven.isOdd(-3));
	}

	@Test
	public void testSingle10() {
		assertEquals(false, CheckOddEven.isOdd(-12));
	}

	@Test
	public void testSingle4() {
		assertEquals(false, CheckOddEven.isOdd(100));
	}
	
	@Test
	public void testSingle5() {
		assertEquals(true, CheckOddEven.isOdd(2333333));
	}

	@Test
	public void testSingle6() {
		assertEquals(false, CheckOddEven.isOdd(12222222));
	}

	@Test
	public void testSingle7() {
		assertEquals(false, CheckOddEven.isOdd(128));
	}

}
