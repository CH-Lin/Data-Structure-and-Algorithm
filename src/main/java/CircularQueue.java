class CircularQueue {
	private CQueueNode ref;
	private CQueueNode last;
	int size;

	CircularQueue() {
		ref = null;
		last = null;
	}

	public void enqueue(String in) {
		// put the data into a node
		CQueueNode temp = new CQueueNode(in);

		// if the queue is empty, make sure the node points to itself
		if (isEmpty()) {
			temp.next = temp;
			ref = temp;
			last = temp;
		}
		// otherwise, insert the node at the reference point and ensure the
		// references ensure a circular structure
		else {
			// insert the new node at the reference point
			temp.next = ref;
			last.next = temp;
			ref = temp;
			size++;
		}
	}

	public void rotate() {
		// if the queue isn't empty, shift the reference and end
		// points across by one node
		if (!isEmpty()) {
			ref = ref.next;
			last = last.next;
		}
	}

	public String dequeue() {
		// work from the reference point
		if (!isEmpty()) {
			// store the data to return
			String temp = ref.data;

			// if there is only one data item, clear the entire
			// queue structure
			if (ref.next == ref) {
				ref = null;
				last = null;
			}
			// otherwise, remove the node
			else {
				ref = ref.next;
				last.next = ref;
			}

			return temp;
		} else
			return null;
	}

	public String peek() {
		if (!isEmpty())
			return ref.data;
		else
			return null;
	}

	public boolean isEmpty() {
		return (ref == null);
	}
}

class CQueueNode {
	String data;
	CQueueNode next;

	CQueueNode(String data) {
		this.data = data;
		next = null;
	}
}
