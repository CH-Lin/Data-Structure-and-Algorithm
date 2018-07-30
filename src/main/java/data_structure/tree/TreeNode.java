package data_structure.tree;

public class TreeNode<T extends Comparable<T>> implements Comparable<TreeNode<T>> {

	public T val;

	public TreeNode(T val) {
		this.val = val;
	}

	@Override
	public int compareTo(TreeNode<T> o) {
		if (val == null)
			return -1;
		if (o == null)
			return 1;
		return val.compareTo(o.val);
	}

}
