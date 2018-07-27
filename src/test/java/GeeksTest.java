
import org.junit.Test;

import geeksforgeeks.FindMedianInAStream;

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
}
