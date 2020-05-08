public class TreeNode {

	public TreeNode left;
	public TreeNode parent;
	public TreeNode right;

	public int key;

	public TreeNode(int key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "" + key;
	}

}
