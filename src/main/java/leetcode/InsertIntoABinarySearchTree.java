package leetcode;

public class InsertIntoABinarySearchTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode insertIntoBST(TreeNode root, int val) {

		TreeNode current = root;
		TreeNode newNode = new TreeNode(val);

		while (current != null) {
			if (val > current.val) {
				if (current.right != null) {
					current = current.right;
				} else {
					current.right = newNode;
					break;
				}
			} else {
				if (current.left != null) {
					current = current.left;
				} else {
					current.left = newNode;
					break;
				}
			}
		}

		return root;
	}
}
