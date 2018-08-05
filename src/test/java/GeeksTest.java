
import org.junit.Test;

import geeksforgeeks.AlphanumericPalindrome;
import geeksforgeeks.BalancedParentheses;
import geeksforgeeks.FindMedianInAStream;
import geeksforgeeks.FindtheMissingNumber;
import geeksforgeeks.MergeArray;

import static org.junit.Assert.*;

public class GeeksTest {
	@Test
	public void testFindMedianInAStream() {
		FindMedianInAStream median = new FindMedianInAStream();
		median.insert(5);
		assertEquals("", 5, median.getMedian());
		median.insert(15);
		assertEquals("", 10, median.getMedian());
		median.insert(1);
		assertEquals("", 5, median.getMedian());
		median.insert(3);
		assertEquals("", 4, median.getMedian());
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

	@Test
	public void testAlphanumericPalindrome() {
		assertEquals("", true, AlphanumericPalindrome.isPalindrome("I am :IronnorI Ma, i"));
		assertEquals("", true, AlphanumericPalindrome.isPalindrome("Ab?/Ba"));
		assertEquals("", false, AlphanumericPalindrome.isPalindrome("Ab?/Ca"));
	}

	@Test
	public void testFindtheMissingNumber() {
		assertEquals("", 5, FindtheMissingNumber.find(new int[] { 1, 2, 4, 6, 3, 7, 8 }));
	}

}
