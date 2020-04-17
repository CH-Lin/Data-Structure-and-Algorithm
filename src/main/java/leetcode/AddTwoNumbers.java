package leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return new ListNode(0);
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode result = l1;
		int carry = 0;
		while (l1 != null || l2 != null) {
			l1.val += ((l2 != null) ? l2.val : 0) + carry;
			carry = l1.val / 10;
			l1.val %= 10;
			if (l1.next == null && (carry > 0 || (l2 != null && l2.next != null))) {
				l1.next = new ListNode(0);
			}
			l1 = l1.next;
			l2 = l2 != null ? l2.next : null;
		}
		return result;
	}

	public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode result = new ListNode(0);
		ListNode current = result;
		while (l1 != null || l2 != null) {
			int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
			current.next = new ListNode(sum % 10);
			current = current.next;
			carry = sum / 10;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}
		if (carry > 0)
			current.next = new ListNode(carry);
		return result.next;
	}

	public static void main(String args[]) {
		ListNode l1 = new ListNode(7);
		l1.next = new ListNode(0);
		l1.next.next = new ListNode(8);
		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(4);
		ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
		while (result != null) {
			System.out.print(result.val);
			if (result.next != null) {
				System.out.print("->");
			}
			result = result.next;
		}
	}
}
