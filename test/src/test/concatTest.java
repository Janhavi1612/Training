package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class concatTest {

	@Test
	void testConcatenate() {
		Junit test = new Junit();
		String result = test.concatenate("janhavi", "dabak");
		assertEquals("janhavidabak",result);
	}

}
