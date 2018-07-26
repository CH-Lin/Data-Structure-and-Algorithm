package algorithm;

import java.util.Comparator;

public class Data implements Comparator<Data> {
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
