
public class Solution {
	public ListNode reverse(ListNode head) {
		if(head == null) return null;
		if(head.next == null) return head;
		
		ListNode secondElem = head.next;
		head.next = null;
		ListNode reverseRest = reverse(secondElem);
		
		secondElem.next = head;
		return reverseRest;
	}

}
