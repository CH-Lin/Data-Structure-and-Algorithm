package algorithm;

import java.math.BigDecimal;

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

	public static BigDecimal calculate(BigDecimal n) {
		// initial first two values for dynamic programing
		BigDecimal n0 = new BigDecimal(0), n1 = new BigDecimal(1), result = new BigDecimal(0);
		if (n.compareTo(new BigDecimal(0)) == 0) {
			return new BigDecimal(0);
		} else if (n.compareTo(new BigDecimal(1)) == 0) {
			return new BigDecimal(1);
		}

		// update values to get the finad result
		for (BigDecimal i = new BigDecimal(2); i.compareTo(n) <= 0; i = i.add(new BigDecimal(1))) {
			result = n0.add(n1);
			n0 = n1;
			n1 = result;
		}

		return result;
	}
}