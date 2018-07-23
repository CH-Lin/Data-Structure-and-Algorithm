package algorithm;

import java.util.Comparator;

public class QuickSort {

	private static <T> int partition(T data[], int left, int right, Comparator<? super T> c) {
		int i = left, j = right;
		T pivot = data[(right + left) / 2], temp;
		while (i <= j) {
			while (c.compare(data[i], pivot) < 0) {
				i++;
			}
			while (c.compare(data[j], pivot) > 0) {
				j--;
			}
			if (i <= j) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}

	public static <T> void sort(T data[], int left, int right, Comparator<? super T> c) {
		int idx = partition(data, left, right, c);
		if (left < idx - 1)
			sort(data, left, idx - 1, c);
		if (idx < right)
			sort(data, idx, right, c);
	}

	public static <T> void sort(T data[], Comparator<? super T> c) {
		sort(data, 0, data.length - 1, c);
	}
}
