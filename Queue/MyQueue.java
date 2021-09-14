package Queue;

public class MyQueue {
	Node head, tail;

	public MyQueue() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void traverse() {
		while (!isEmpty()) {
			System.out.print(dequeue()+" ");
		}
	}

	public void enqueue(int x) {
		Node newNode = new Node(x);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public int dequeue() {
		int de = 0;
		if (isEmpty()) {
			System.out.println("Queue is empty!");
		} else {
			de = head.getData();
			head = head.getNext();
		}
		return de;
	}
}
