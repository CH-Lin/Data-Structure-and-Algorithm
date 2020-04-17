package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListComponents {
	public int numComponents(ListNode head, int[] G) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < G.length; i++) {
			set.add(G[i]);
		}

		int nums = 0;
		boolean start = false;
		while (head != null) {
			if (!set.contains(head.val)) {
				start = false;
			} else {
				if (!start)
					nums++;
				start = true;
			}
			head = head.next;
		}

		return nums;
	}
}
