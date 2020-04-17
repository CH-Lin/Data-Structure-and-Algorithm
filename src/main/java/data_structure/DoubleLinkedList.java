package data_structure;

class DoubleLinkedListNode<T> {

	public T value;
	public DoubleLinkedListNode<T> pre;
	public DoubleLinkedListNode<T> next;

	public DoubleLinkedListNode(T value) {
		this.value = value;
	}

	public boolean isEqual(T value) {
		return this.value == value;
	}

	public boolean isEqual(DoubleLinkedListNode<T> node) {
		return this.value == node.value;
	}
}

public class DoubleLinkedList<T> {

	private DoubleLinkedListNode<T> head;

	public DoubleLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public boolean isLast(DoubleLinkedListNode<T> node) {
		return node.next == null;
	}

	public DoubleLinkedListNode<T> find(T value) {
		DoubleLinkedListNode<T> temp = head;
		while (temp != null && temp.value != value) {
			temp = temp.next;
		}
		return temp;
	}

	public DoubleLinkedListNode<T> findPrevious(T value) {
		DoubleLinkedListNode<T> temp = head;
		if (temp != null && temp.next != null) {
			while (temp.next != null && temp.next.value != value) {
				temp = temp.next;
			}
			return temp;
		}
		return null;
	}
}
