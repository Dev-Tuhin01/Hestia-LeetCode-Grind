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
  public ListNode rotateRight(ListNode head, int k) {
    if(head == null || head.next == null || k == 0) return head;
    ListNode t = head;
    int count = 1;
    while(t.next != null) {
      count++;
      t = t.next;
    }

    t.next = head;
    int i = 1, lim = count - (k % count);
    t = head;


    while(i < lim){
      t = t.next;
      i++;
    }
    head = t.next;
    t.next = null;
    
    return head;
  }
}