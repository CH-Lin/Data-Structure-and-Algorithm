/*************************************************************************
 *  Compilation:  javac MaxPQ.java
 *  Execution:    java MaxPQ < input.txt
 *  
 *  Generic max priority queue implementation with a binary heap.
 *  Can be used with a comparator instead of the natural order,
 *  but the generic Key type must still be Comparable.
 *
 *  % java MaxPQ < tinyPQ.txt 
 *  Q X P (6 left on pq)
 *
 *  We use a one-based array to simplify parent and child calculations.
 *
 *  Can be optimized by replacing full exchanges with half exchanges 
 *  (ala insertion sort).
 *
 *************************************************************************/

import java.util.NoSuchElementException;

public class PQ {
	private int[] pq;
	private int N;

	public PQ(int initCapacity) {
		pq = new int[initCapacity + 1];
		N = 0;
	}

	public PQ() {
		this(1);
	}

	public PQ(int[] keys) {
		N = keys.length;
		pq = new int[keys.length + 1];
		for (int i = 0; i < N; i++)
			pq[i + 1] = keys[i];
		for (int k = N / 2; k >= 1; k--)
			sink(k);
		assert isMaxHeap();
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	public int max() {
		if (isEmpty())
			throw new NoSuchElementException("Priority queue underflow");
		return pq[1];
	}

	// helper function to double the size of the heap array
	private void resize(int capacity) {
		assert capacity > N;
		int[] temp = new int[capacity];
		for (int i = 1; i <= N; i++)
			temp[i] = pq[i];
		pq = temp;
	}

	public void insert(int x) {

		// double size of array if necessary
		if (N >= pq.length - 1)
			resize(2 * pq.length);

		// add x, and percolate it up to maintain heap invariant
		pq[++N] = x;
		swim(N);
		assert isMaxHeap();
	}

	public int delMax() {
		if (isEmpty())
			throw new NoSuchElementException("Priority queue underflow");
		int max = pq[1];
		exch(1, N--);
		sink(1);
		pq[N + 1] = 0;
		if ((N > 0) && (N == (pq.length - 1) / 4))
			resize(pq.length / 2);
		assert isMaxHeap();
		return max;
	}

	private void swim(int k) {
		while (k > 1 && less(k / 2, k)) {
			exch(k, k / 2);
			k = k / 2;
		}
	}

	private void sink(int k) {
		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && less(j, j + 1))
				j++;
			if (!less(k, j))
				break;
			exch(k, j);
			k = j;
		}
	}

	private boolean less(int i, int j) {
		return (pq[i] - pq[j] < 0);

	}

	private void exch(int i, int j) {
		int swap = pq[i];
		pq[i] = pq[j];
		pq[j] = swap;
	}

	private boolean isMaxHeap() {
		return isMaxHeap(1);
	}

	private boolean isMaxHeap(int k) {
		if (k > N)
			return true;
		int left = 2 * k, right = 2 * k + 1;
		if (left <= N && less(k, left))
			return false;
		if (right <= N && less(k, right))
			return false;
		return isMaxHeap(left) && isMaxHeap(right);
	}

}
