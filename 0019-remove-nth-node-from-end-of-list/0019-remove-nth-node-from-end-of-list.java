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
        if(head.next == null) return null;

        int count = 1;
        ListNode prev = null, spotlight = head, curr = head;
        while(count < n) {
            spotlight = spotlight.next;
            count++;
        } 

        while(spotlight.next != null) {
            prev = curr;
            curr = curr.next;
            spotlight = spotlight.next;
            //count++;
        }
        if(prev == null){
            return head.next;
        }
        prev.next = curr.next;
        return head;
    }
}