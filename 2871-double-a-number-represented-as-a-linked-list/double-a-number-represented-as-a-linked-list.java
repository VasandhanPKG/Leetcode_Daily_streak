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
    public ListNode doubleIt(ListNode head) {
        ListNode result = reverse(head);
        ListNode temp=result;
        ListNode prev=null;
        int carry=0;
        while(result!=null)
        {
            int new_value=result.val*2+carry;
            carry=new_value/10;
            result.val=new_value%10;
            prev=result;
            result=result.next;
        }
        if(carry!=0) prev.next=new ListNode(1);
        return reverse(temp);
    }

    public ListNode reverse(ListNode node) {
        ListNode cur = node;
        ListNode nextnode = null;
        ListNode prev = null;
        while (cur != null) {
            nextnode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextnode;
        }
        return prev;
    }
}