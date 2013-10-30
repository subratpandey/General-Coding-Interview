
public class Solution {
	public ListNode reverseR(ListNode head) {
		if(head == null) return null;
		if(head.next == null) return head;
		
		ListNode secondElem = head.next;
		head.next = null;
		ListNode reverseRest = reverseR(secondElem);
		
		secondElem.next = head;
		return reverseRest;
	}
	
	
	public ListNode reverseN(ListNode head) {
		ListNode temp;
		ListNode prev = null;
		while(head != null) {
			temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		return prev;
	}

}
