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
  public ListNode oddEvenList(ListNode head) {
    if(head == null || head.next == null|| head.next.next == null) return head;
    ListNode prevOdd = head, prevEven = head.next, currOdd = head.next.next, currEven = head.next.next.next,t = head.next;
    prevOdd.next = currOdd;
    prevEven.next = currEven;

    while(currEven != null && currEven.next != null && currOdd != null && currOdd.next != null) {
      prevOdd = currOdd;
      prevEven = currEven;
      currOdd = currOdd.next.next;
      currEven = currEven.next.next;
      prevOdd.next = currOdd;
      prevEven.next = currEven;
    }

    currOdd.next = t;

    return head;
  }
}