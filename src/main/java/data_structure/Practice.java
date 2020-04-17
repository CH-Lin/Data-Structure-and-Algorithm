package data_structure;

public class Practice {

	private static int calaulatei3(int n) {
		int result = 0;
		for (int i = 0; i <= n; i++) {
			result += i * i * i;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(calaulatei3(4));
	}

}
