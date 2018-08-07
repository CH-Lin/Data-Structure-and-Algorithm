package algorithm;

interface Node {
	public int compare(Node n);
}

public class BinarySearch<T extends Node> {

	public boolean search(T vals[], T val) {
		int l = 0, r = vals.length - 1;

		while (l <= r) {
			int mid = l + (r - l / 2);

			if (val.compare(vals[mid]) == 0) {
				return true;
			}

			if (val.compare(vals[mid]) > 0) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}

		return false;
	}
}