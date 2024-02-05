package practiceCodeTT;

class Node {
	int value;
	Node left;
	Node right;

	Node(int value) {
		this.value = value;
		left = right = null;
	}
}

public class MaxSumPathInTree {
	Node root;
	int res = Integer.MIN_VALUE;

	public static void main(String[] args) {
		int[] inputArray = { 10, 2, 10, 20, 1, -25, 3, 4 };
		MaxSumPathInTree tree = new MaxSumPathInTree();
		tree.root = addIntoTree(inputArray, 0);
		preOrder(tree.root);
		
		System.out.println("max sum is :: "+tree.findMaxSum(tree.root));

	}

	private int findMaxSum(Node root) {
		getMaxByPath(root);
		return res;
	}

	private int getMaxByPath(Node root) {
		if(root == null) {
			System.out.println("root == null");
			return 0;
		}
		System.out.println("Value of left ::  "+getMaxByPath(root.left));
		System.out.println("Value of right ::  "+getMaxByPath(root.right));
		int left = Math.max(0, getMaxByPath(root.left));
		int right = Math.max(0, getMaxByPath(root.right));
		int currentPathval = left + right + root.value;
		System.out.println("value of current path :: "+ currentPathval);
		res = Math.max(res, currentPathval);
		System.out.println("Value of res ::: "+res);
		System.out.println("final ::"+Math.max(left, right) + root.value);
		return Math.max(left, right) + root.value;
		
	}

	private static void preOrder(Node root) {
		if(root != null) {
			System.out.print(root.value+"     ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}

	private static Node addIntoTree(int[] inputArray, int i) {
		Node root = null;
		if(i < inputArray.length) {
			root = new Node(inputArray[i]);
			root.left = addIntoTree(inputArray, 2* i + 1);
			root.right = addIntoTree(inputArray, 2* i + 2);
		}
		return root;
	}

}
