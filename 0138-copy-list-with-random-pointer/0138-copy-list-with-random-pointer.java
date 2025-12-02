/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
  public Node copyRandomList(Node head) {
    if(head == null) return null;
    Node curr = new Node(head.val);
    Node Chead = curr, it = head.next,prev = curr;
    HashMap<Node,Node> map = new HashMap<Node,Node>();
    map.put(head,curr);

    while(it != null){
      curr = new Node(it.val);
      map.put(it,curr);
      prev.next = curr;
      prev = curr;
      it = it.next;
    }

    it = head; curr = Chead;

    while(it != null) {
      curr.random = map.getOrDefault(it.random,null);
      curr = curr.next;
      it = it.next;
    }

    // System.out.println(map);
    return Chead;
  }
}