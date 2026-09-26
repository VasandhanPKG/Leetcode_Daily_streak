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
        int len=1;
        ListNode cur=head;
        if (head==null|| head.next==null) return head;

        while(cur.next!=null)
        {
            cur=cur.next;
            len++;
        }
        k=k%len;
        if(k==0) return head;
        int pos=0;
        ListNode temp=head;
        while(pos++<len-k-1)
        {
            temp=temp.next;
        }
        ListNode last=temp;
        ListNode newhead=temp.next;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        last.next=null;
        return newhead;
    }
}