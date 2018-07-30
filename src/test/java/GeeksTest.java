
import org.junit.Test;

import geeksforgeeks.BalancedParentheses;
import geeksforgeeks.FindMedianInAStream;
import geeksforgeeks.MergeArray;

import static org.junit.Assert.*;

public class GeeksTest {
	@Test
	public void testFindMedianInAStream() {
		FindMedianInAStream median = new FindMedianInAStream();
		median.insert(5);
		assertEquals("", median.getMedian(), 5);
		median.insert(15);
		assertEquals("", median.getMedian(), 10);
		median.insert(1);
		assertEquals("", median.getMedian(), 5);
		median.insert(3);
		assertEquals("", median.getMedian(), 4);
	}

	@Test
	public void testBalancedParentheses() {
		char exp[] = { '{', '(', ')', '}', '[', ']' };
		BalancedParentheses.areParenthesisBalanced(exp);
		assertEquals("", true, BalancedParentheses.areParenthesisBalanced(exp));
		char exp2[] = { '{', '(', ')', '}', '}', '[', ']' };
		BalancedParentheses.areParenthesisBalanced(exp);
		assertEquals("", false, BalancedParentheses.areParenthesisBalanced(exp2));
	}

	@Test
	public void testMergeArray() {
		int A[] = { 2, 8, -1, -1, -1, 13, -1, 15, 20 };
		int B[] = { 5, 7, 9, 25 };
		int result[] = { 2, 5, 7, 8, 9, 13, 15, 20, 25 };
		MergeArray.merge(A, B);
		assertArrayEquals(result, A);
	}

}
