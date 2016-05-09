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
		assertEquals("III", Roman.intToRoman(2));
	}
	

}
