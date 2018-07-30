package geeksforgeeks;

public class MergeArray {

	public static void moveToBack(int A[]) {
		int j = A.length - 1;
		for (int i = A.length - 1; i >= 0; i--) {
			if (A[i] != -1) {
				A[j] = A[i];
				j--;
			}
		}
	}

	public static void merge(int A[], int B[]) {
		moveToBack(A);

		int i = B.length;
		int j = 0;

		for (int k = 0; k < A.length; k++) {
			if ((i < A.length && A[i] <= B[j]) || j == B.length) {
				A[k] = A[i];
				i++;
			} else {
				A[k] = B[j];
				j++;
			}
		}
	}
}
