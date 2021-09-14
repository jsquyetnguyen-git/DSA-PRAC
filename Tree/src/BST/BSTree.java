package BST;

public class BSTree {
	Node root;

	public BSTree() {
		root = null;
	}

	public boolean isEmpty() {
		return (root == null);
	}

	public Node search(Node p, int x) {
		if (p == null)
			return null;

		if (p.info == x)
			return p;
		if (x < p.info) {
			return search(p.left, x);
		} else {
			return search(p.right, x);
		}

	}

	public void insert(int x) {
		Node newNode = new Node(x);

		if (isEmpty()) {
			root = newNode;
			return;
		}

		Node f, p;
		f = null;
		p = root;

		while (p != null) {
			if (p.info == x) {
				System.out.println("The key " + x + " already exist, no insertion.");
				return;
			}

			f = p;
			if (x < p.info) {
				p = p.left;
			} else {
				p = p.right;
			}
		}

		if (x < f.info) {
			f.left = newNode;
		} else {
			f.right = newNode;
		}

	}

	// Ham insert nhieu phan tu

	public void insertMany(int[] a) {
		for (int i = 0; i < a.length; i++) {
			insert(a[i]);
		}
	}

	// Ham tham node
	public void visitNode(Node p) {
		System.out.print(p.info + " ");
	}

	// Ham duyet pre order
	public void preOrder(Node p) {
		if (p == null) {
			return;
		}

		visitNode(p);
		preOrder(p.left);
		preOrder(p.right);
	}

	// Ham duyet inorder
	public void inOrder(Node p) {
		if (p == null) {
			return;
		}
		inOrder(p.left);
		visitNode(p);
		inOrder(p.right);
	}

	// Ham duyet post order
	public void postOrder(Node p) {
		if (p == null) {
			return;
		}
		postOrder(p.left);
		postOrder(p.right);
		visitNode(p);
	}

}
