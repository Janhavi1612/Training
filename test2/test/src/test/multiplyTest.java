package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multiplyTest {

	@Test
	void testMultiply() {
		Junit test = new Junit();
		int result = test.multiply(5, 6);
		assertEquals(30,result);
	}

}
