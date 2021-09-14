package Stack;

public class Node {
	private char data;
	private Node nextNode;
	
	public Node(char data) {
		this(data,null);
	}
	
	public Node(char data, Node nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}
