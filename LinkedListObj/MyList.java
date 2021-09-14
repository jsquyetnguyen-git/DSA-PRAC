package LinkedListObj;

public class MyList {
	Node head, tail;

	public MyList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void vist(Node x) {
		System.out.print(x.data + " ");
		System.out.println();
	}

	public void traverse() {
		Node temp = head;
		while (temp != null) {
			vist(temp);
			temp = temp.getNextNode();
		}
	}

	public void addToHead(People p) {
		Node newNode = new Node(p);
		if (isEmpty()) {
			head = tail = newNode;
		}else {
			newNode.setNextNode(head);
			head = newNode;
		}
	}
}
