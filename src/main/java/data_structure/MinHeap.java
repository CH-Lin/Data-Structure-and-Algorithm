package data_structure;

public class MinHeap {
	private int size;
	private int data[];

	public MinHeap() {
		size = 0;
		data = new int[50];
	}

	public void insert(int val) {
		int i = size;
		int parentIdx = (int) Math.floor((i - 1) / 2);
		while (i > 0 && val < data[parentIdx]) {
			data[i] = data[parentIdx];
			i = parentIdx;
			parentIdx = (int) Math.floor((i - 1) / 2);
		}
		size++;
		data[i] = val;
	}

	public int findMin() {
		if (size == 0)
			return -1;
		return data[0];
	}

	public int exactMin() {
		if (size == 0)
			return -1;

		int val = data[0];
		data[0] = data[size - 1];
		size--;
		minHeapify(0);
		return val;
	}

	private void minHeapify(int idx) {
		int largest = idx;
		int leftIdx = (idx * 2) + 1;
		int rightIdx = (idx * 2) + 2;
		if (leftIdx < size && data[idx] > data[leftIdx])
			largest = leftIdx;
		if (rightIdx < size && data[largest] > data[rightIdx])
			largest = rightIdx;
		if (idx != largest) {
			int temp = data[idx];
			data[idx] = data[largest];
			data[largest] = temp;
			minHeapify(largest);
		}
	}

	public int getSize() {
		return size;
	}
}
