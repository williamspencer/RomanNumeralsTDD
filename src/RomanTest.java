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
	

}
