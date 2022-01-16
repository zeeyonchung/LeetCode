/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        int pre = 0;
        
        while (l1 != null || l2 != null || pre > 0) {
            if (l1 != null) {
                pre += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                pre += l2.val;
                l2 = l2.next;
            }
            
            head.next = new ListNode(pre % 10);
            head = head.next;
            pre /= 10;
        }
        
        return result.next;
    }
}