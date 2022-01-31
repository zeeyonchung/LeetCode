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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front = head;
        ListNode mid = head;
        ListNode back = null;
        int i = 0;
        
        while (front != null) {
            if (i++ < n) {
                front = front.next;
                continue;
            }
            
            back = mid;
            mid = mid.next;
            front = front.next;
        }
        
        if (back != null) {
            back.next = mid.next;
        }
        else {
            head = mid.next;
        }
        
        return head;
    }
}