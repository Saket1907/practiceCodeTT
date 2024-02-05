package interviewQuestions;

class Node {
	int value;
	Node left, right;

	Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}
}

public class SNTreeImplementation {

	Node root;

	public static void main(String[] args) {
		SNTreeImplementation tree = new SNTreeImplementation();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		
		displayTree(tree.root);
	}

	private static void displayTree(Node node) {
		if(node != null) {
			displayTree(node.left);
			System.out.println(node.value);
			displayTree(node.right);
		}
		
	}
}
