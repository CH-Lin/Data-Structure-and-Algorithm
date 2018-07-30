package algorithm;

public class Kadane {

	public static int cal(int values[]) {
		int maxEndingHere = values[0];
		int maxSoFar = values[0];
		for (int i = 0; i < values.length; i++) {
			maxEndingHere += values[i];
			maxEndingHere = Math.max(values[i], maxEndingHere);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}
}
