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
    public ListNode removeElements(ListNode head, int val) {
        ListNode res=new ListNode(0,head);
        ListNode cur=res;

        while(cur!=null)
        {
            while(cur.next!=null && cur.next.val==val)
            {
                cur.next=cur.next.next;
            }
            cur=cur.next;

        }
        return res.next;
    }
}