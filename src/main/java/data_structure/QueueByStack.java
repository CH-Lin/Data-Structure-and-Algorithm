package data_structure;

public class QueueByStack<T> {
	private java.util.Stack<T> s1;
	private java.util.Stack<T> s2;

	public QueueByStack() {
		s1 = new java.util.Stack<>();
		s2 = new java.util.Stack<>();
	}

	public void enQueue(T val) {
		s1.push(val);
	}

	public T deQueue() {
		if (s1.isEmpty() && s2.isEmpty())
			return null;
		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				T val = s1.pop();
				s2.push(val);
			}
		}
		return s2.pop();
	}
}
