package algorithm;

public class Fibonacci {
	public static long calculate(int n) {
		long n1 = 1, n2 = 1, result = 0;
		if (n < 3)
			return n;
		for (int i = 3; i <= n; i++) {
			result = n1 + n2;
			n1 = n2;
			n2 = result;
		}
		return result;
	}
}