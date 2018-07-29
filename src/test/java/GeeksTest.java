
import org.junit.Test;

import geeksforgeeks.BalancedParentheses;
import geeksforgeeks.FindMedianInAStream;

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

}
