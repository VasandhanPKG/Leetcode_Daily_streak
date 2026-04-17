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
        if(head==null) return head;
        int len=1;
        ListNode dummy=null;
        for( dummy=head;dummy.next!=null;dummy=dummy.next,len++);
        
        k=k%len;
        if(k==0) return head;
        ListNode cur=null;
        int i=0;
        for( cur=head;i<len-k-1;cur=cur.next,i++);
        ListNode newhead=cur.next;
        cur.next=null;
        dummy.next=head;
        return newhead;
    }
}