
import org.junit.Test;

import algorithm.MergeSort;
import algorithm.QuickSort;
import static org.junit.Assert.*;

public class AlgorithmTest {
	@Test
	public void testQuickSortMethod() {
		Integer data[] = { 8, 4, 6, 100, 20, 1 };
		Integer target[] = { 1, 4, 6, 8, 20, 100 };
		new QuickSort().sort(data, 0, data.length - 1);
		assertArrayEquals(target, data);
	}

	@Test
	public void testMergeSortMethod() {
		Integer data[] = { 8, 4, 6, 100, 20, 1 };
		Integer target[] = { 1, 4, 6, 8, 20, 100 };
		MergeSort.sort(data);
		assertArrayEquals(target, data);
	}
}
