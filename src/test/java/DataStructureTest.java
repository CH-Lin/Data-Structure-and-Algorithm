
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
		assertEquals("", queue.deQueue(), (Integer) 2);
		assertEquals("", queue.deQueue(), (Integer) 10);
		assertEquals("", queue.deQueue(), (Integer) 8);
	}

	@Test
	public void testMaxHeap() {
		MaxHeap heap = new MaxHeap();
		heap.insert(5);
		heap.insert(4);
		heap.insert(10);
		assertEquals("", heap.exactMax(), 10);
		assertEquals("", heap.exactMax(), 5);
		assertEquals("", heap.exactMax(), 4);
	}

	@Test
	public void testMinHeap() {
		MinHeap heap = new MinHeap();
		heap.insert(5);
		heap.insert(4);
		heap.insert(10);
		assertEquals("", heap.exactMin(), 4);
		assertEquals("", heap.exactMin(), 5);
		assertEquals("", heap.exactMin(), 10);
	}
}
