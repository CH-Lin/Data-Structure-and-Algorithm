package algorithm;

import java.util.Arrays;

public class Kadane {

	public static int cal(int values[]) {
		int maxEndingHere = values[0];
		int maxSoFar = values[0];
		for (int i = 1; i < values.length; i++) {
			maxEndingHere += values[i];
			maxEndingHere = Math.max(values[i], maxEndingHere);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

	public static int[] cal2(int values[]) {
		int maxEndingHere = values[0];
		int maxSoFar = values[0];
		int start = 0, end = 0, beg = 0;
		for (int i = 1; i < values.length; i++) {
			maxEndingHere += values[i];
			if (values[i] > maxEndingHere) {
				maxEndingHere = values[i];
				beg = i;
			}
			if (maxEndingHere > maxSoFar) {
				maxSoFar = maxEndingHere;
				start = beg;
				end = i;
			}
		}
		return Arrays.copyOfRange(values, start, end + 1);
	}

}
