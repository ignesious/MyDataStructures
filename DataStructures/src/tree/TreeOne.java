package tree;
/*
 * https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
 * 
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

public class TreeOne {
	TreeNode root;
	TreeNode first;
	TreeNode second;

	public void insert(int key) {
		root = insertRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	TreeNode insertRec(TreeNode root, int key) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new TreeNode(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.val)
			root.left = insertRec(root.left, key);
		else if (key > root.val)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	public void printBinaryTree(TreeNode root, int level) {
		if (root == null)
			return;
		printBinaryTree(root.right, level + 1);
		if (level != 0) {
			for (int i = 0; i < level - 1; i++)
				System.out.print("|\t");
			System.out.println("|-------" + root.val);
		} else
			System.out.println(root.val);
		printBinaryTree(root.left, level + 1);
	}

	public void inOrder(TreeNode root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.val);
		inOrder(root.right);
	}

	public void preOrder(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.val);
		preOrder(root.left);
		preOrder(root.right);
	}

	public void postOrder(TreeNode root) {
		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val);
	}

	public void insertFromArray(int a[], TreeOne treeObj) {
		for (int i : a) {
			treeObj.insert(i);
		}

	}

	private void traversals(TreeOne treeObj) {
		System.out.println("-----------------INORDER-------------------");
		treeObj.inOrder(treeObj.root);
		System.out.println();
		System.out.println("-----------------PREORDER-------------------");
		treeObj.preOrder(treeObj.root);
		System.out.println();
		System.out.println("-----------------POSTORDER-------------------");
		treeObj.postOrder(treeObj.root);
	}

	/*
	 * https://practice.geeksforgeeks.org/problems/check-for-bst/1
	 * https://youtu.be/MILxfAbIhrE
	 * https://github.com/mission-peace/interview/blob/master/src/com/interview/tree
	 * /IsBST.java
	 * 
	 */
	public boolean isBst(TreeNode root) {

		return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBst(TreeNode root, int min, int max) {

		if (root == null) {
			return true;
		}

		if (root.val <= min || root.val > max) {
			return false;
		}

		return (isBst(root.left, min, root.val) && isBst(root.right, root.val, max));
	}

	public static void main(String[] args) {

		TreeOne treeObj = new TreeOne();

		int a[] = { 1, 2, 3 };

		treeObj.insertFromArray(a, treeObj);
		treeObj.printBinaryTree(treeObj.root, 0);

		// treeObj.traversals(treeObj);
		// System.out.println(treeObj.isBst(treeObj.root));
	}

}
