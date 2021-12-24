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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode result = head.next; 
        ListNode prev = head;
        
        while (head != null && head.next != null) {
            ListNode temp = head.next;
            prev.next = temp;
            head.next = head.next.next;
            temp.next = head;
            prev = head;
            head = head.next;
        }
        
        return result;
    }
}