package data_structure.tree;

public interface Tree<T extends Comparable<?>> {

	public void insert(T value);

	public void delete(T value);

	public boolean search(T value);
}
