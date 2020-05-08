public class Tst {

	public Tst() {
		boolean[][] a = new boolean[5][5];

		boolean[][] b = new boolean[5][5];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = false;
				b[i][j] = true;
			}
		}

		for (boolean i[] : a) {
			for (boolean j : i) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n\n");
		for (boolean i[] : b) {
			for (boolean j : i) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		test(a, b);
		System.out.print("\n\n");
		for (boolean i[] : a) {
			for (boolean j : i) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n\n");
		for (boolean i[] : b) {
			for (boolean j : i) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}

	public void test(boolean[][] a, boolean[][] b) {

		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				a[i][j] |= b[i][j];

	}

	public static void main(String[] args) {

		new Tst();
	}
}
