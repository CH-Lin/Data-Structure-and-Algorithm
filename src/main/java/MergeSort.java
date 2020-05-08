import java.util.Arrays;

public class MergeSort {

	private static void mergeSort(int data[]) {
		int l = data.length;

		if (l < 2)
			return;

		int mid = l / 2;

		int a1[] = Arrays.copyOfRange(data, 0, mid);
		int a2[] = Arrays.copyOfRange(data, mid, l);

		mergeSort(a1);
		mergeSort(a2);

		merge(a1, a2, data);
	}

	private static void merge(int[] a1, int[] a2, int data[]) {
		int i = 0, j = 0;

		while (i + j < data.length) {

			if (j == a2.length || (i < a1.length && a1[i] < a2[j])) {
				data[i + j] = a1[i++];
			} else {
				data[i + j] = a2[j++];
			}

		}

	}

	private static void mergeSortButtonUp(int[] data) {
		int l = data.length;

		int[] src = data;
		int[] dest = new int[l];

		int[] temp;

		for (int i = 1; i < l; i *= 2) {
			for (int j = 0; j < l; j += 2 * i) {
				mergeButtonUp(src, dest, j, i);
			}
			temp = src;
			src = dest;
			dest = temp;
		}
		if (data != src)
			System.arraycopy(src, 0, data, 0, l);
	}

	private static void mergeButtonUp(int[] in, int[] out, int start, int inc) {
		int end1 = Math.min(start + inc, in.length);
		int end2 = Math.min(start + 2 * inc, in.length);

		int x = start;
		int y = start + inc;
		int z = start;

		while (x < end1 && y < end2) {
			if (in[x] < in[y])
				out[z++] = in[x++];
			else
				out[z++] = in[y++];
		}
		if (x < end1)
			System.arraycopy(in, x, out, z, end1 - x);
		else if (y < end2)
			System.arraycopy(in, y, out, z, end2 - y);
	}

	private static void mergeSort(int data[], int result[], int start, int end) {
		if (start >= end) {
			return;
		}
		int len = end - start, mid = (len >> 1) + start;
		int start1 = start, end1 = mid;
		int start2 = mid + 1, end2 = end;
		mergeSort(data, result, start1, end1);
		mergeSort(data, result, start2, end2);
		int k = start;
		while (start1 <= end1 && start2 <= end2) {
			result[k++] = data[start1] < data[start2] ? data[start1++] : data[start2++];
		}
		while (start1 <= end1) {
			result[k++] = data[start1++];
		}
		while (start2 <= end2) {
			result[k++] = data[start2++];
		}
		for (int i = start; i <= end; i++) {
			data[i] = result[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = new int[] { 10, 34, 24, 8, 9, 100, 3, -23 };
		mergeSort(data);
		for (int i : data) {
			System.out.print(i + " ");
		}
		System.out.println();
		data = new int[] { 10, 34, 24, 8, 9, 100, 3, -23 };
		int result[] = new int[data.length];
		mergeSort(data, result, 0, data.length - 1);
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		data = new int[] { 10, 34, 24, 8, 9, 100, 3, -23 };
		mergeSortButtonUp(data);
		for (int i : data) {
			System.out.print(i + " ");
		}
	}

}
