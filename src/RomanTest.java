import static org.junit.Assert.*;

import org.junit.Test;

public class RomanTest {
	Roman r = new Roman();
	@Test
	public void test1() {
		assertEquals("I", r.intToRoman(1));
	}
	@Test
	public void test2() {
		assertEquals("II", r.intToRoman(2));
	}
	

}
