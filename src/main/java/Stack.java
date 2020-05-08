public class Stack {

	private static final int MAX = 100;

	private int[] elements;

	private int index = -1;

	public Stack() {
		elements = new int[MAX];
	}

	public Stack(int max) {
		elements = new int[max];
	}

	public boolean isEmpty() {
		return (index == -1);
	}

	public int size() {
		return index + 1;
	}

	public void push(int data) throws IllegalStateException {
		if (size() == MAX)
			throw new IllegalStateException("Stack is full");

		elements[++index] = data;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return elements[index];
	}

	public int pop() {
		if (isEmpty())
			return -1;

		int result = elements[index];
		index--;

		return result;
	}

	public static void main(String[] args) {

		Stack s = new Stack(5);
		s.push(1);
		System.out.println(s.top());
		s.push(2);
		s.push(3);
		System.out.println(s.top());
		s.push(5);
		s.pop();
		System.out.println(s.top());
	}
}
