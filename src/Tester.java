import java.util.Comparator;

import algorithm.MergeSort;
import algorithm.QuickSort;

class Data implements Comparator<Data> {
	public int value;

	public Data(int value) {
		this.value = value;
	}

	@Override
	public int compare(Data d1, Data d2) {
		if (d1.value < d2.value)
			return -1;
		if (d1.value == d2.value)
			return 0;
		return 1;
	}
}

class DataComparator extends Data {

	public DataComparator() {
		super(0);
	}

}

class sfsf{
	
}

public class Tester {

	public static void main(String[] args) {
		Data d[] = { new Data(10), new Data(121), new Data(11), new Data(1241), new Data(5) };
		MergeSort.sort(d, new DataComparator());
		for (Data dd : d) {
			System.out.print(dd.value + " ");
		}
		System.out.println();
		Data d2[] = { new Data(10), new Data(121), new Data(11), new Data(1241), new Data(5) };

		QuickSort.sort(d2, new DataComparator());
		for (Data dd : d2) {
			System.out.print(dd.value + " ");
		}

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(3);
		list.add(10);
		System.out.println();
		ListNode<Integer> n = list.search(3);
		System.out.println(n != null ? "NOT NULL " + n.value : "NULL");
		list.delete(3);
		System.out.println();
		n = list.search(3);
		System.out.println(n != null ? "NOT NULL " + n.value : "NULL");
	}

}
