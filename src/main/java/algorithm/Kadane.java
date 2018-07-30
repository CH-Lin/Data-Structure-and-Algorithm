package algorithm;

public class Kadane {

	public static int cal(int values[]) {
		int maxEndingHere = 0;
		int maxSoFar = 0;
		for (int i = 0; i < values.length; i++) {
			maxEndingHere += values[i];
			maxEndingHere = Math.max(0, maxEndingHere);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}
}
