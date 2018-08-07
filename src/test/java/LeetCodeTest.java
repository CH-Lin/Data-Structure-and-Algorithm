import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import leetcode.CheckSquare;
import leetcode.CheckSquarePoint;
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

	@Test
	public void testCheckSquare() {
		CheckSquarePoint points[] = { new CheckSquarePoint(10, 10), new CheckSquarePoint(15, 15),
				new CheckSquarePoint(15, 5), new CheckSquarePoint(20, 10) };
		assertEquals(true, new CheckSquare().check(points[0], points[1], points[2], points[3]));
	}
}
