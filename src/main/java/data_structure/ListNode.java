package data_structure;

public class ListNode<T extends Comparable<?>> {
	public T value;
	public ListNode<T> next;

	public ListNode(T value) {
		this.value = value;
	}
}