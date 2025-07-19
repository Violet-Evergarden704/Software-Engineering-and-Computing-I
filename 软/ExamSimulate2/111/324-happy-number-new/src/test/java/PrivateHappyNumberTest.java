import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class PrivateHappyNumberTest {



	@Test
	public void testSingleF() {

		assertEquals(false, HappyNumber.isHappy(12345678));

	}

	

	@Test
	public void testSingleG() {

		assertEquals(true, HappyNumber.isHappy(7));

	}

	

	@Test
	public void testSingleH() {

		assertEquals(false, HappyNumber.isHappy(2023));

	}


	@Test
	public void testSingleI() {

		assertEquals(true, HappyNumber.isHappy(1111111));

	}


	@Test
	public void testSingleJ() {

		assertEquals(true, HappyNumber.isHappy(23));

	}


	

	

}