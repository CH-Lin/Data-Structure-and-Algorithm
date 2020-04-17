package data_structure;

class ListNode2<T> {
	ListNode2<T> next = null;
	T value;

	public ListNode2(T value) {
		this.value = value;
	}

	boolean isEqual(T value) {
		return this.value == value;
	}

	boolean isEqual(ListNode2<T> node2) {
		return this.value == node2.value;
	}
}

public class LinkedList2<T> {

	private ListNode2<T> head;

	public LinkedList2() {
		this.head = null;
	}

	boolean isEmpty() {
		return head == null;
	}

	boolean isLast(ListNode2<T> node) {
		return node.next == null;
	}

	public ListNode2<T> find(T key) {
		ListNode2<T> temp = head;
		while (temp != null && !temp.isEqual(key))
			temp = temp.next;
		return null;
	}

	public ListNode2<T> find(ListNode2<T> key) {
		ListNode2<T> temp = head;
		while (temp != null && !temp.isEqual(key))
			temp = temp.next;
		return null;
	}

	public ListNode2<T> findPrevious(T key) {
		ListNode2<T> temp = head;
		if (temp != null && temp.next != null) {
			while (!temp.next.isEqual(key)) {
				temp = temp.next;
				if (temp.next == null)
					return null;
			}
			return temp;
		}
		return null;
	}

	public ListNode2<T> findPrevious(ListNode2<T> key) {
		ListNode2<T> temp = head;
		if (temp != null && temp.next != null) {
			while (!temp.next.isEqual(key)) {
				temp = temp.next;
				if (temp.next == null)
					return null;
			}
			return temp;
		}
		return null;
	}

	public void insert(T key) {
		if (head == null) {
			ListNode2<T> newNode = new ListNode2<T>(key);
			head = newNode;
		} else {
			ListNode2<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			insert(key, temp);
		}
	}

	public void insert(ListNode2<T> newNode) {
		if (head == null) {
			head = newNode;
		} else {
			ListNode2<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			insert(newNode, temp);
		}
	}

	public void insert(T key, ListNode2<T> node) {
		ListNode2<T> newNode = new ListNode2<T>(key);
		newNode.next = node.next;
		node.next = newNode;
	}

	public void insert(ListNode2<T> newNode, ListNode2<T> node) {
		if (newNode != null) {
			newNode.next = node.next;
			node.next = newNode;
		}
	}

	public void delete(T key) {
		ListNode2<T> pre = findPrevious(key);
		if (pre != null && pre.next != null) {
			pre.next = pre.next.next;
		}
	}

	public void delete(ListNode2<T> key) {
		ListNode2<T> pre = findPrevious(key);
		if (pre != null && pre.next != null) {
			pre.next = pre.next.next;
		}
	}
}
