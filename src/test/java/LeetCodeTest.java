import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import leetcode.TwoSum;
import leetcode.ZigZagConversion;

public class LeetCodeTest {
	@Test
	public void testZigZagConversion() {
		assertEquals("", "PAHNAPLSIIGYIR", ZigZagConversion.convert("PAYPALISHIRING", 3));
	}

	@Test
	public void testTwoSum() {
		int target[] = { 0, 1 };
		assertArrayEquals(target, new TwoSum().twoSum(new int[] { 2, 7, 11, 15 }, 9));
	}
}
