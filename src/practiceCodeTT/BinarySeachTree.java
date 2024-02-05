package practiceCodeTT;
/*
 *  find sum of all left leaf of the tree.
 * */

public class BinarySeachTree {
	
	Node root;
	
	public static void main(String[] args) {
		
		BinarySeachTree bst = new BinarySeachTree();
		
		bst.root = new Node(20);
		bst.root.left = new Node(9);
		bst.root.right = new Node(49);
		bst.root.left.right = new Node(12);
		bst.root.left.left = new Node(5);
		bst.root.right.left = new Node(23);
		bst.root.right.right = new Node(52);
		bst.root.left.right.right = new Node(12);
		bst.root.right.right.left = new Node(50);
		
		System.out.println(findSumOfLeftLeaf(bst.root));
			
	}

	private static int findSumOfLeftLeaf(Node root) {
		int sumOfleftLeaf = 0 ;
		if(root != null) {
			if(isLeftLeaf(root.left)) {
				sumOfleftLeaf = sumOfleftLeaf + root.left.value;
			}else {
				sumOfleftLeaf = sumOfleftLeaf + findSumOfLeftLeaf(root.left);
			}
			sumOfleftLeaf = sumOfleftLeaf + findSumOfLeftLeaf(root.right);
		}
		
		return sumOfleftLeaf;
	}
	
	private static boolean isLeftLeaf(Node root) {
		if(root == null) {
			return false;
		}
		if(root.left == null && root.right == null) {
			return false;
		}
		return false;
	}

}
