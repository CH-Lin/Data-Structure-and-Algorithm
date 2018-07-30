package data_structure.tree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	class BinarySearchTreeNode extends TreeNode<T> {
		public BinarySearchTreeNode left, right;

		public BinarySearchTreeNode(T val) {
			super(val);
			left = right = null;
		}
	}

	BinarySearchTreeNode root;

	@Override
	public void insert(T value) {
		if (root == null) {
			root = new BinarySearchTreeNode(value);
		} else {
			BinarySearchTreeNode parent = null;
			BinarySearchTreeNode node = new BinarySearchTreeNode(value);
			BinarySearchTreeNode current = root;
			while (current != null) {
				parent = current;
				if (node.compareTo(current) < 0) {
					current = current.left;
				} else if (node.compareTo(current) > 0) {
					current = current.right;
				}
			}

			if (node.compareTo(parent) < 0) {
				parent.left = node;
			} else if (node.compareTo(current) > 0) {
				parent.right = node;
			}
		}
	}

	public int getMinDepth() {
		return minDepth(root);
	}

	private int minDepth(BinarySearchTreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		if (root.left == null) {
			return minDepth(root.right) + 1;
		} else if (root.right == null) {
			return minDepth(root.left) + 1;
		}
		return Math.min(minDepth(root.right), minDepth(root.left)) + 1;
	}

	@Override
	public boolean search(T value) {
		if (root == null) {
			return false;
		} else {
			BinarySearchTreeNode node = new BinarySearchTreeNode(value);
			BinarySearchTreeNode current = root;
			while (current != null) {
				if (node.compareTo(current) < 0) {
					current = current.left;
				} else if (node.compareTo(current) > 0) {
					current = current.right;
				} else if (node.compareTo(current) == 0) {
					return true;
				}
			}
			return false;
		}
	}

	@Override
	public void delete(T value) {
		if (root == null) {
			return;
		} else {
			BinarySearchTreeNode node = new BinarySearchTreeNode(value);
			BinarySearchTreeNode parent = null;
			BinarySearchTreeNode current = root;
			while (current != null) {
				if (node.compareTo(current) < 0) {
					parent = current;
					current = current.left;
				} else if (node.compareTo(current) > 0) {
					parent = current;
					current = current.right;
				} else if (node.compareTo(current) == 0) {
					if (node.compareTo(parent) < 0) {
						if (node.right != null) {
							parent.left = node.right;
						} else if (node.left != null) {
							parent.left = node.left;
						}
					} else if (node.compareTo(parent) > 0) {
						if (node.left != null) {
							parent.right = node.left;
						} else if (node.right != null) {
							parent.right = node.right;
						}
					}
					break;
				}
			}
		}
	}
}
