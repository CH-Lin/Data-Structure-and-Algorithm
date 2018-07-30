import static org.junit.Assert.assertEquals;

import org.junit.Test;

import leetcode.ZigZagConversion;

public class LeetCodeTest {
	@Test
	public void testZigZagConversion() {
		assertEquals("", "PAHNAPLSIIGYIR", ZigZagConversion.convert("PAYPALISHIRING", 3));
	}
}
