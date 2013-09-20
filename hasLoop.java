
public class Solution {
	public static boolean hasLoop(ListNode head) {
		if(head == null) return false;
		ListNode slow = head;
		ListNode fast = head;
		
		while(true) {
			slow = slow.next;
			if(fast.next != null) {
				fast = fast.next.next;
			} else {
				return false;
			}
			
			if(slow == null || fast == null) return false;
			
			if(slow == fast) return true;
		}	
	}
	
	public static void main(String[] args) {
		int num[] = {1, 2, 4, 8, 9, 5};
		
		ListNode l1 = ListNode.buildList(num);
		ListNode node = ListNode.findNode(l1, 2);
		ListNode node2 = ListNode.findNode(l1, 5);
		node2.next = node;
		
		System.out.println(hasLoop(l1));
	}

}
