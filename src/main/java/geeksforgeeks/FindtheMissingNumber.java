package geeksforgeeks;

public class FindtheMissingNumber {
	public static int find(int values[]) {
		int length = values.length + 1;
		int sum = 0;
		int expected = length * (length + 1) / 2;
		for (int i : values) {
			sum += i;
		}
		return expected - sum;
	}
}
