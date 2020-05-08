public class RedBlackTreeNode {

	public TreeNodeColor color;
	public RedBlackTreeNode left;
	public RedBlackTreeNode parent;
	public RedBlackTreeNode right;

	public int key;

	public RedBlackTreeNode(int key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return new StringBuffer(key).toString();
	}
}
