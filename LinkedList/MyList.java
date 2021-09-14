package LinkedList;

public class MyList {
	Node head, tail;
	int size = 0;

	public MyList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void visitNode(Node x) {
		System.out.print(x.getData() + " ");
	}

	public void traverse() {
		Node temp = head;
		while (temp != null) {
			visitNode(temp);
			temp = temp.getNextNode();
		}
	}

	public void inserToHead(int x) {
		Node newNode = new Node(x);
		size++;

		if (isEmpty()) {
			head = tail = newNode;
		} else {
			newNode.setNextNode(head);
			head = newNode;
		}
	}

	public void insertToLast(int x) {
		Node newNode = new Node(x);
		size++;
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.setNextNode(newNode);
			tail = newNode;
		}
	}

	public void insertToIndex(int x, int index) {
		Node newNode = new Node(x);

		if (index > size) {
			System.out.println("Out of range!");
		} else if (size == 0) {
			inserToHead(x);
		} else if (index == size) {
			insertToLast(x);
		} else {
			size++;
			Node temp = null;
			Node current = head;
			for (int i = 0; i < index; i++) {
				temp = current;
				current = current.getNextNode();
			}
			temp.setNextNode(newNode);
			newNode.setNextNode(current);
		}
	}

	public void search(int key) {
		Node current = head;
		int index = 0;

		while (current != null) {
			if (current.getData() == key) {
				System.out.println("Index of " + key + " :" + index);
				return;
			}
			current = current.getNextNode();
			index++;
		}
		System.out.println("Not found!");
	}

	public void deleteByIndex(int index) {

		if (index > size - 1) {
			System.out.println("Out of range, Try again!");
		} else if (index == 0) {
			head = head.getNextNode();
		} else {
			Node preNode = null;
			Node current = head;
			for (int i = 0; i < index; i++) {
				preNode = current;
				current = current.getNextNode();
			}
			preNode.setNextNode(current.getNextNode());
		}
	}

	public void deleteByKey(int key) {
		if (head.getData() == key) {
			head = head.getNextNode();
		} else {
			Node preNode = head;
			Node current = head.getNextNode();
			while (current != null) {
				if (current.getData() == key) {
					break;
				}
				preNode = current;
				current = current.getNextNode();
			}
			preNode.setNextNode(current.getNextNode());

		}
	}
	
	public void sort() {

		Node pi, pj;
		pi = head;
		
		while (pi != null) {
			pj = pi.getNextNode();
			while (pj != null) {
				if (pi.getData() > pj.getData()) {
					int temp = pi.getData();
					pi.setData(pj.getData());
					pj.setData(temp);
				}
				pj = pj.getNextNode();
			}
			pi = pi.getNextNode();
		}
		
		
		System.out.println();
		System.out.print("Sorted:");
		traverse();
	}
}