package BST;

public class Main {

	public static void main(String[] args) {
		BSTree t = new BSTree();

		int[] a = { 25, 10, 30, 5, 20, 10, 15 };
		t.insertMany(a);

		System.out.print("\nPre-order traverse:");
		t.preOrder(t.root);
		System.out.print("\nIn-order traverse:");
		t.inOrder(t.root);
		System.out.print("\nPost-order traverse:");
		t.postOrder(t.root);
	}

}
