import java.util.Random;

public class QuickSort {

	public static final Random RND = new Random();

	private static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	private static int partition(int[] array, int begin, int end) {
		int index = begin + RND.nextInt(end - begin + 1);
		int pivot = array[index];
		swap(array, index, end);
		for (int i = index = begin; i < end; ++i) {
			if (array[i] < pivot) {
				swap(array, index++, i);
			}
		}
		swap(array, index, end);
		return index;
	}

	private static void qsort(int[] array, int begin, int end) {
		if (end > begin) {
			int index = partition(array, begin, end);
			qsort(array, begin, index - 1);
			qsort(array, index + 1, end);
		}
	}

	private static void qsort_tail(int[] array, int begin, int end) {
		while (end > begin) {
			int index = partition(array, begin, end);
			qsort(array, begin, index - 1);
			begin = index + 1;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] { 10, -23, 24, 4, 2, 56, 100, 40 };
		// qsort(array, 0, array.length - 1);
		qsort_tail(array, 0, array.length - 1);

		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
