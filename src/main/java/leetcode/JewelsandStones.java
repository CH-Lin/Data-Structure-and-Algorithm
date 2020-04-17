package leetcode;

public class JewelsandStones {
	public int numJewelsInStones(String J, String S) {
		int output = 0;
		for (char c : S.toCharArray()) {
			if (J.indexOf(c) > -1) {
				output++;
			}
		}
		return output;
	}
}
