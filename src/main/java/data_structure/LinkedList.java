package data_structure;

public class LinkedList<T extends Comparable<?>> {
	ListNode<T> head;

	public void add(T value) {
		if (head == null) {
			head = new ListNode<T>(value);
		} else {
			ListNode<T> last = getLast();
			last.next = new ListNode<T>(value);
		}
	}

	public ListNode<T> getLast() {
		if (head == null) {
			return null;
		} else {
			ListNode<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			return current;
		}
	}

	public void delete(T value) {
		if (head != null) {
			ListNode<T> current = head;
			if (current.value.equals(value)) {
				head = null;
			}
			while (current.next != null) {
				if (current.next.value.equals(value)) {
					current.next = current.next.next;
					break;
				} else {
					current = current.next;
				}
			}
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public ListNode<T> search(T value) {
		ListNode<T> current = head;
		while (current != null && !current.value.equals(value)) {
			current = current.next;
		}
		return current;
	}
}
