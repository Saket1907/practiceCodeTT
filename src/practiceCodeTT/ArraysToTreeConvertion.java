package practiceCodeTT;

class Node{
	int value;
	Node left, right;
	Node(int value){
		this.value = value;
		left = right = null;
	}
}

public class ArraysToTreeConvertion {
	
	Node root;
	
	public static void main(String[] args) {
		ArraysToTreeConvertion tree = new ArraysToTreeConvertion();
		int[] inputArray = {
				1, 2 , 3, 4, 5, 6, 7, 8, 9, 10, 11
		};
		//insert values into tree
		tree.root = tree.addValuesInTree(inputArray, 0);
		inOrder(tree.root);
		
		 //System.out.println(inOrder(tree.root, 3));
		
	}

	private static void inOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.value+ "    ");
			inOrder(root.right);
		}
		
	}
	
	/*
	 * @SuppressWarnings("null") private static boolean inOrder(Node root, int i) {
	 * if(root != null || root.value == i) { inOrder(root.left, i);
	 * inOrder(root.right, i); return true; } return false; }
	 */
	
	private static Node addValuesInTree(int[] inputArray, int i) {
		Node root = null;
		if(i < inputArray.length) {
			root = new Node(inputArray[i]);
			root.left = addValuesInTree(inputArray, 2*i + 1);
			root.right = addValuesInTree(inputArray, 2*i + 2);
		}
		return root;
	}
}
