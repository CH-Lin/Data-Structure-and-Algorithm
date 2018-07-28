
import org.junit.Test;

import algorithm.CountingSort;
import algorithm.Knapsack;
import algorithm.KnapsackData;
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

	@Test
	public void testCountingSort() {
		char data[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's' };
		char target[] = { 'e', 'e', 'e', 'e', 'f', 'g', 'g', 'k', 'k', 'o', 'r', 's', 's' };
		CountingSort.sort(data);
		assertArrayEquals(target, data);
	}

	@Test
	public void testKnapsack() {
		int weights[] = { 4, 5, 2, 1, 6 };
		int values[] = { 4500, 5700, 2250, 1100, 6700 };
		assertEquals("", Knapsack.calculate(weights, values, 8), 9050);

		KnapsackData data[] = { new KnapsackData(4, 4500), new KnapsackData(5, 5700), new KnapsackData(2, 2250),
				new KnapsackData(1, 1100), new KnapsackData(6, 6700) };
		assertEquals("", Knapsack.calculate(data, 8), 9050);

	}
}
