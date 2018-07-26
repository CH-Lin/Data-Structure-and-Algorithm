package algorithm;

import java.util.Comparator;

public class QuickSort {

	public void sort(Integer vals[], int f, int r) {
		class IntComparator implements Comparator<Integer> {
			@Override
			public int compare(Integer d1, Integer d2) {
				if (d1 < d2)
					return -1;
				if (d1 == d2)
					return 0;
				return 1;
			}
		}
		sort(vals, f, r, new IntComparator());
	}

	public <T> void sort(T vals[], int f, int r, Comparator<? super T> c) {
		if (f >= r)
			return;
		int m = partition(vals, f, r, c);
		sort(vals, f, m - 1, c);
		sort(vals, m + 1, r, c);
	}

	private <T> int partition(T vals[], int f, int r, Comparator<? super T> c) {
		T key = vals[r];
		int i = f - 1;
		for (int j = f; j < r; j++) {
			if (c.compare(vals[j], key) <= 0) {
				swap(vals, ++i, j);
			}
		}
		swap(vals, i + 1, r);
		return i + 1;
	}

	private <T> void swap(T vals[], int i, int j) {
		T temp = vals[i];
		vals[i] = vals[j];
		vals[j] = temp;
	}
}

class QuickSortV2 {

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
