/**
 * find the nth node to the last in a singly linked list
 * 
 **/
 
public class Solution {
	public ListNode nthToLast(ListNode head, int n) {
		if(head == null || n < 1) return null;
		ListNode p1 = head;
		ListNode p2 = head;
		
		for(int i = 0; i < n - 1; ++i) {
			if(p2 == null) return null;
			p2 = p2.next;
		}
		
		while(p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}

}
