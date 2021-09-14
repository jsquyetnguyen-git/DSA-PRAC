package BSTree;

public class BStree {
	Node root;
	
	public BStree() {
		root = null;
	}
	
	public Node find(int data) {
		if(root!=null) {
			return root.find(data);
		}
		return null;
	}
	

	
	

}
