
import org.junit.Test;

import data_structure.LinkedList;
import data_structure.ListNode;

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
}
