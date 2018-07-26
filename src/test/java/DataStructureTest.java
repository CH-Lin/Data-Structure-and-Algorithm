
import org.junit.Test;

import data_structure.MaxHeap;
import data_structure.MinHeap;
import data_structure.LinkedList;
import data_structure.ListNode;
import data_structure.QueueByStack;

import static org.junit.Assert.*;

public class DataStructureTest {
	@Test
	public void testLinkedList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(3);
		list.add(10);
		ListNode<Integer> n = list.search(3);
		assertEquals("Search result for 3 must exist", (Integer) 3, n.value);
		list.delete(3);
		n = list.search(3);
		assertNull("Search result for 3 must be null", n);
	}

	@Test
	public void testQueueByStack() {
		QueueByStack<Integer> queue = new QueueByStack<>();
		queue.enQueue(2);
		queue.enQueue(10);
		queue.enQueue(8);
		assertEquals("", (Integer) 2, queue.deQueue());
		assertEquals("", (Integer) 10, queue.deQueue());
		assertEquals("", (Integer) 8, queue.deQueue());
	}

	@Test
	public void testMaxHeap() {
		MaxHeap heap = new MaxHeap();
		heap.insert(5);
		heap.insert(4);
		heap.insert(10);
		assertEquals("", 10, heap.exactMax());
		assertEquals("", 5, heap.exactMax());
		assertEquals("", 4, heap.exactMax());
	}

	@Test
	public void testMinHeap() {
		MinHeap heap = new MinHeap();
		heap.insert(5);
		heap.insert(4);
		heap.insert(10);
		assertEquals("", 4, heap.exactMin());
		assertEquals("", 5, heap.exactMin());
		assertEquals("", 10, heap.exactMin());
	}
}
