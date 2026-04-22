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
        ListNode p1=head;
        ListNode p2=head;
        int ctr=1;
        while(ctr <=n)
        {
          p1=p1.next;
          ctr++;
        }
        if(p1==null) return head.next;
        while(p1.next!=null)
        {
          p1=p1.next;
          p2=p2.next;
        }
        if(p2.next!=null)
        {
            p2.next=p2.next.next;
        }
        return head;
        
    }
}