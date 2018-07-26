package leetcode;

public class StringtoInteger {
	public int myAtoi(String str) {
		long result = 0;
		str = str.trim();
		boolean neg = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 46) {
				break;
			} else if (str.charAt(i) == 45) {
				neg = true;
				if (i != 0)
					return 0;
				continue;
			} else if (str.charAt(i) == 43) {
				if (i != 0)
					return 0;
				continue;
			}
			if (((int) str.charAt(i)) < 48 || ((int) str.charAt(i)) > 57)
				break;
			result *= 10;
			result += ((int) str.charAt(i)) - 48;
			if (neg) {
				result = result > 2147483648L ? 2147483648L : result;
				result = result < -2147483647 ? -2147483647 : result;
			} else {
				result = result > 2147483647 ? 2147483647 : result;
				result = result < -2147483648 ? -2147483648 : result;
			}
		}
		if (neg) {
			result *= -1;
		}
		result = result > 2147483647 ? 2147483647 : result;
		result = result < -2147483648 ? -2147483648 : result;
		return (int) result;
	}

	public static void main(String args[]) {
		System.out.println(new StringtoInteger().myAtoi(" +0193.3"));
	}
}
