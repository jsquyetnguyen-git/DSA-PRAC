package LinkedListObj;

public class Node {
	People data;
	Node nextNode;
	
	public Node (People data) {
		this(data,null);
	}
	
	public Node(People data, Node nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}

	public People getData() {
		return data;
	}

	public void setData(People data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
