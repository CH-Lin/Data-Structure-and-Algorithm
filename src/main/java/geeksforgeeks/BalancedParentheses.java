package geeksforgeeks;

import java.util.Stack;

public class BalancedParentheses {

	public static boolean areParenthesisBalanced(char exp[]) {
		Stack<Character> s = new Stack<>();
		for (char c : exp) {
			if (c == '{' || c == '(' || c == '[') {
				s.push(c);
			} else {
				if (s.isEmpty()) {
					return false;
				} else {
					char c2 = s.pop();
					if (c == '}' && c2 != '{') {
						return false;
					} else if (c == ')' && c2 != '(') {
						return false;
					} else if (c == ']' && c2 != '[') {
						return false;
					}
				}
			}
		}
		if (s.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		char exp[] = { '{', '(', ')', '}', '[', ']' };
		if (areParenthesisBalanced(exp))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
