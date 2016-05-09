import static org.junit.Assert.*;

import org.junit.Test;

public class RomanTest {
	@Test
	public void test1() {
		assertEquals("I", Roman.intToRoman(1));
	}
	@Test
	public void test2() {
		assertEquals("II", Roman.intToRoman(2));
	}
	@Test
	public void test3() {
		assertEquals("III", Roman.intToRoman(3));
	}
	@Test
	public void test4() {
		assertEquals("IV", Roman.intToRoman(4));
	}
	@Test
	public void test5() {
		assertEquals("V", Roman.intToRoman(5));
	}
	@Test
	public void test6() {
		assertEquals("VI", Roman.intToRoman(6));
	}
	@Test
	public void test7() {
		assertEquals("VII", Roman.intToRoman(7));
	}
	@Test
	public void test8() {
		assertEquals("VIII", Roman.intToRoman(8));
	}
	@Test
	public void test9() {
		assertEquals("IX", Roman.intToRoman(9));
	}
	@Test
	public void test10() {
		assertEquals("X", Roman.intToRoman(9));
	}

}
