package BSTree;

public class Node {
	private int data;
	private Node leftChild, rightChild;
	
	public Node(int data) {
		this.data = data;
		leftChild = rightChild = null;
	}
	
	
	public Node find(int data) {
		if(this.data == data) {
			return this;
		}
		
		if(data < this.data && leftChild!=null) {
			return leftChild.find(data);
		}
		
		if(data < this.data && rightChild!=null) {
			return rightChild.find(data);
		}
		
		return null;
	}
	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	

}
