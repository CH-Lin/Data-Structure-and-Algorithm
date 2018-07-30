package algorithm;

public class CountingSort {
	public static void sort(char data[]) {
		int n = data.length;

		char result[] = new char[n];

		int count[] = new int[256];
		for (int i = 0; i < 256; ++i)
			count[i] = 0;

		for (int i = 0; i < n; ++i)
			++count[data[i]];

		for (int i = 1; i <= 255; ++i)
			count[i] += count[i - 1];

		for (int i = 0; i < n; ++i) {
			result[count[data[i]] - 1] = data[i];
			--count[data[i]];
		}

		for (int i = 0; i < n; ++i)
			data[i] = result[i];
	}

}
