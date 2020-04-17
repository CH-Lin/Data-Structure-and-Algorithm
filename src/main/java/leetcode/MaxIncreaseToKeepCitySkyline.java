package leetcode;

public class MaxIncreaseToKeepCitySkyline {
	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int maxLeftRight[] = new int[grid.length];
		int maxTopButtom[] = new int[grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			maxLeftRight[i] = 0;
		}
		for (int i = 0; i < grid[0].length; i++) {
			maxTopButtom[i] = 0;
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (maxLeftRight[i] < grid[i][j]) {
					maxLeftRight[i] = grid[i][j];
				}
				if (maxTopButtom[j] < grid[i][j]) {
					maxTopButtom[j] = grid[i][j];
				}
			}
		}

		int max = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				max += Math.min(maxLeftRight[i], maxTopButtom[j]) - grid[i][j];
			}
		}
		return max;
	}
}
