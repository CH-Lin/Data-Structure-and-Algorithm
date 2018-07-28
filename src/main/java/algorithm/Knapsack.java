package algorithm;

public class Knapsack {

	public static <T extends KnapsackData> int calculate(T data[], int limit) {
		int vals[] = new int[limit + 1];
		int items[] = new int[limit + 1];
		for (int i = 0; i < data.length; i++) {
			for (int w = data[i].getWeight(); w <= limit; w++) {
				int available = w - data[i].getWeight();
				int newValue = vals[available] + data[i].getValue();
				if (newValue > vals[w]) {
					vals[w] = newValue;
					items[w] = i;
				}
			}
		}
		return vals[limit];
	}

	public static int calculate(int weights[], int values[], int limit) {
		int vals[] = new int[limit + 1];
		int items[] = new int[limit + 1];
		for (int i = 0; i < weights.length; i++) {
			for (int w = weights[i]; w <= limit; w++) {
				int available = w - weights[i];
				int newValue = vals[available] + values[i];
				if (newValue > vals[w]) {
					vals[w] = newValue;
					items[w] = i;
				}
			}
		}
		return vals[limit];
	}
}
