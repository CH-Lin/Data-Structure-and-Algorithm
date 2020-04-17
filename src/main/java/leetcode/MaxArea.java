package leetcode;

public class MaxArea {

	public int maxArea(int[] height) {
		int r = height.length - 1;
		int l = 0;
		int max = 0;
		while (r > l) {
			int w = r - l;
			int a = w * (height[r] > height[l] ? height[l++] : height[r--]);
			if (a > max)
				max = a;
		}
		return max;
	}

	public static void main(String args[]) {
		System.out.println(new MaxArea().maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}
}
