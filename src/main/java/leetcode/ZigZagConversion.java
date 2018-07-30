package leetcode;

public class ZigZagConversion {
	public static String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		StringBuffer rows[] = new StringBuffer[numRows];
		for (int i = 0; i < rows.length; i++) {
			rows[i] = new StringBuffer();
		}
		int currentRow = 0;
		boolean up = false;
		for (int i = 0; i < s.length(); i++) {
			if (currentRow == numRows - 1 || currentRow == 0)
				up = !up;
			rows[currentRow].append(s.charAt(i));

			if (up)
				currentRow++;
			else
				currentRow--;

		}
		for (int i = 1; i < rows.length; i++) {
			rows[0].append(rows[i]);
		}
		return rows[0].toString();
	}
}
