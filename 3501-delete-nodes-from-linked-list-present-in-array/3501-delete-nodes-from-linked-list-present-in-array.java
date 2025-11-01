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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums) set.add(i);
        ListNode curr = head, idx = head, prev=head;
        //System.out.println(set);
        
        while(curr != null && idx != null) {
          if(!set.contains(idx.val)) {
            curr.val = idx.val;
            //System.out.println(curr.val);
            prev = curr;
            curr = curr.next;
          }
          idx = idx.next;
        }
        // System.out.println(curr.val);
        if(prev != null) prev.next =  null;

        return head;
    }
}