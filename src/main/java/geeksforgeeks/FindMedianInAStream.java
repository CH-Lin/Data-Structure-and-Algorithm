package geeksforgeeks;

import data_structure.MaxHeap;
import data_structure.MinHeap;

public class FindMedianInAStream {
	private MinHeap min;
	private MaxHeap max;

	public FindMedianInAStream() {
		min = new MinHeap();
		max = new MaxHeap();
	}

	public void insert(int val) {
		if (min.getSize() == 0 && min.getSize() == max.getSize()) {
			max.insert(val);
		} else {
			if (val < max.findMax()) {
				max.insert(val);
			} else {
				min.insert(val);
			}
		}
		if (max.getSize() > min.getSize() && (max.getSize() - min.getSize()) > 1) {
			int v = max.exactMax();
			min.insert(v);
		} else if (max.getSize() < min.getSize() && (min.getSize() - max.getSize()) > 1) {
			int v = min.exactMin();
			max.insert(v);
		}
	}

	public int getMedian() {
		if (min.getSize() == max.getSize()) {
			return (min.findMin() + max.findMax()) / 2;
		} else if (min.getSize() > max.getSize()) {
			return min.findMin();
		} else {
			return max.findMax();
		}
	}
}
