package Stack;

public class MyStack {

	Node head;

	public MyStack() {
		head = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void traverse() {
		while (!isEmpty()) {
			System.out.print(pop());
		}
	}

	public char pop() {
		char pop = 0;
		if (isEmpty()) {
			System.out.println("Stack is empty!");
		} else {
			pop = head.getData();
			head = head.getNextNode();
		}
		return pop;
	}

	public void push(char x) {
		Node newNode = new Node(x);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.setNextNode(head);
			head = newNode;
		}
	}

	public void convert(String x) {
		for (int i = 0; i < x.length(); i++) {
			push(x.charAt(i));
		}
	}
}
