package geeksforgeeks;

public class AlphanumericPalindrome {

	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		boolean ok = true;
		while (i < j) {
			char a = str.charAt(i);
			while (!isAlphaNum(a)) {
				a = str.charAt(++i);
			}
			char b = str.charAt(j);
			while (!isAlphaNum(b)) {
				b = str.charAt(--j);
			}
			if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
				ok = false;
				break;
			}

			i++;
			j--;
		}
		return ok;
	}

	private static boolean isAlphaNum(char c) {
		if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
			return true;
		}
		return false;
	}
}
