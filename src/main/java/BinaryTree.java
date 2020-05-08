public class BinaryTree implements Tree {

	TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public void insert(TreeNode node) {
		TreeNode temp = null;
		TreeNode x = root;

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
	}

	private void Transplant(TreeNode u, TreeNode v) {
		if (u.parent == null) {
			root = v;
		} else if (u == u.parent.left) {
			u.parent.left = v;
		} else {
			u.parent.right = v;
		}
		if (v != null) {
			v.parent = u.parent;
		}
	}

	public void delete(TreeNode z) {

		if (z.left == null) {
			Transplant(z, z.right);
		} else if (z.right == null) {
			Transplant(z, z.left);
		} else {
			TreeNode y = getMin(z.right);
			if (y.parent != z) {
				Transplant(y, y.right);
				y.right = z.right;
				y.right.parent = y;
			}
			Transplant(z, y);
			y.left = z.left;
			y.left.parent = y;
		}

	}

	public TreeNode search(int key) {

		TreeNode node = root;

		while (node != null && node.key != key) {
			if (node.key > key)
				node = node.left;
			else
				node = node.right;
		}

		return node;
	}

	public TreeNode getMin(TreeNode node) {
		while (node.left != null)
			node = node.left;
		return node;
	}

	public TreeNode getMax(TreeNode node) {
		while (node.right != null)
			node = node.right;
		return node;
	}

	public TreeNode succesor(TreeNode x) {
		if (x.right != null)
			return getMin(x.right);

		TreeNode y = x.parent;

		while (y != null && y.right != null && y.right.equals(x)) {
			x = y;
			y = y.parent;
		}

		return y;
	}

	public TreeNode predecessor(TreeNode x) {
		if (x.left != null)
			return getMax(x.left);

		TreeNode y = x.parent;

		while (y != null && y.left != null && y.left.equals(x)) {
			x = y;
			y = y.parent;
		}

		return y;
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

		TreeNode nodes[] = new TreeNode[] { new TreeNode(44), new TreeNode(17),
				new TreeNode(88), new TreeNode(8), new TreeNode(32),
				new TreeNode(65), new TreeNode(97), new TreeNode(28),
				new TreeNode(54), new TreeNode(82), new TreeNode(93),
				new TreeNode(21), new TreeNode(29), new TreeNode(76),
				new TreeNode(68), new TreeNode(80) };

		for (TreeNode i : nodes) {
			tree.insert(i);
		}

		TreeNode node = tree.search(11);
		if (node != null)
			System.out.println("Found");
		else
			System.out.println("Not found");

		System.out.println(tree.getMin(tree.getRoot()));
		System.out.println(tree.getMax(tree.getRoot()));

		System.out.println(tree.succesor(nodes[2]));
		System.out.println(tree.predecessor(nodes[2]));

		System.out.println(nodes[0].parent);
		System.out.println(nodes[0].left);
		System.out.println(nodes[0].right);

		tree.delete(nodes[1]);

		System.out.println(nodes[0].parent);
		System.out.println(nodes[0].left);
		System.out.println(nodes[0].right);
	}

}
