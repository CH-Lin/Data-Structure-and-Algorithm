public class RedBlackTree extends BinaryTree implements Tree {

	RedBlackTreeNode root;

	public void insert(RedBlackTreeNode node) {
		RedBlackTreeNode temp = null;
		RedBlackTreeNode x = root;

		while (x != null) {
			temp = x;
			if (node.key < x.key)
				x = x.left;
			else
				x = x.right;
		}

		node.parent = temp;
		if (temp == null)
			root = node;
		else if (node.key < temp.key)
			temp.left = node;
		else if (node.key > temp.key)
			temp.right = node;
		node.color = TreeNodeColor.RED;
		insertFixup(node);
	}

	private RedBlackTreeNode grandparent(RedBlackTreeNode n) {
		if ((n != null) && (n.parent != null)) {
			return n.parent.parent;
		} else {
			return null;
		}
	}

	private RedBlackTreeNode uncle(RedBlackTreeNode n) {
		RedBlackTreeNode g = grandparent(n);
		if (g == null) {
			return null;
		} else if (n.parent == g.left) {
			return g.right;
		} else {
			return g.left;
		}
	}

	private void insertFixup(RedBlackTreeNode z) {
		if (z.parent == null) {
			z.color = TreeNodeColor.BLACK;
		} else {
			insertCase2(z);
		}
	}

	private void insertCase2(RedBlackTreeNode n) {
		if (n.parent.color == TreeNodeColor.BLACK) {
			return;
		} else {
			insertCase3(n);
		}
	}

	private void insertCase3(RedBlackTreeNode n) {
		RedBlackTreeNode u = uncle(n);
		RedBlackTreeNode g;

		if ((u != null) && (u.color == TreeNodeColor.RED)) {
			n.parent.color = TreeNodeColor.BLACK;
			u.color = TreeNodeColor.BLACK;
			g = grandparent(n);
			g.color = TreeNodeColor.RED;
			insertFixup(n);
		} else {
			insertCase4(n);
		}
	}

	private void insertCase4(RedBlackTreeNode n) {
		RedBlackTreeNode g = grandparent(n);

		if ((n == n.parent.right) && (n.parent == g.left)) {
			leftRotate(n.parent);
			n = n.left;
		} else if ((n == n.parent.left) && (n.parent == g.right)) {
			rightRotate(n.parent);
			n = n.right;
		}

		insertCase5(n);
	}

	private void insertCase5(RedBlackTreeNode n) {
		RedBlackTreeNode g = grandparent(n);
		n.parent.color = TreeNodeColor.BLACK;
		g.color = TreeNodeColor.RED;
		if (n == n.parent.left) {
			rightRotate(g);
		} else {
			leftRotate(g);
		}
	}

	private void leftRotate(RedBlackTreeNode x) {
		RedBlackTreeNode y = x.right;
		x.right = y.left;

		if (y.left != null)
			y.left.parent = x;

		y.parent = x.parent;
		if (x.parent == null) {
			root = y;
		} else if (x == x.parent.left) {
			x.parent.left = y;
		} else {
			x.parent.right = y;
		}
		y.left = x;
		x.parent = y;
	}

	private void rightRotate(RedBlackTreeNode x) {
		RedBlackTreeNode y = x.left;
		x.left = y.right;

		if (y.right != null)
			y.right.parent = x;

		y.parent = x.parent;
		if (x.parent == null) {
			root = y;
		} else if (x == x.parent.right) {
			x.parent.right = y;
		} else {
			x.parent.left = y;
		}
		y.right = x;
		x.parent = y;
	}

	public static void main(String[] args) {

		RedBlackTree tree = new RedBlackTree();

		RedBlackTreeNode nodes[] = new RedBlackTreeNode[] {
				new RedBlackTreeNode(44), new RedBlackTreeNode(17),
				new RedBlackTreeNode(88), new RedBlackTreeNode(8),
				new RedBlackTreeNode(32), new RedBlackTreeNode(65),
				new RedBlackTreeNode(97), new RedBlackTreeNode(28),
				new RedBlackTreeNode(54), new RedBlackTreeNode(82),
				new RedBlackTreeNode(93), new RedBlackTreeNode(21),
				new RedBlackTreeNode(29), new RedBlackTreeNode(76),
				new RedBlackTreeNode(68), new RedBlackTreeNode(80) };

		for (RedBlackTreeNode i : nodes) {
			System.out.println("Insert " + i);
			tree.insert(i);
		}

	}
}
