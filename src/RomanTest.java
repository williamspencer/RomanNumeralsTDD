import static org.junit.Assert.*;

import org.junit.Test;

public class RomanTest {
	Roman r = new Roman();
	@Test
	public void test() {
		assertEquals("I", r.intToRoman(1));
	}

}