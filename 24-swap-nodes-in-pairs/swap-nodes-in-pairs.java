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
        ListNode result=new ListNode(-1);
        result.next=head;
        ListNode cur=head;
        ListNode prev=result;
        ListNode second=null;

        while(cur!=null && cur.next!=null)
        {
            second=cur.next;
            prev.next=second;
            cur.next=second.next;
            second.next=cur;
            prev=cur;
            cur=cur.next;
            
        }
        return result.next;
    }
}