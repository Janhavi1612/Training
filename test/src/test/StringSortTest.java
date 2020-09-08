package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class StringSortTest {

	@Test
	void testStringSort() {
		Junit test = new Junit();
		String arrInput[] = {"bat", "apple", "cat"};
		String arrExpected[] = {"apple","bat","cat"};
		String result[] = test.sortStrings(arrInput);
		Assert.assertArrayEquals(arrExpected, result);
	}

}
