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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rl1=reverse(l1);
        ListNode rl2=reverse(l2);
        ListNode result=new ListNode(-1);
        ListNode ans=result;
        int sum=0;
        int carry=0;
        while(rl1!=null||rl2!=null||carry!=0)
        {
            sum=carry;
            if(rl1!=null)
            {
                sum+=rl1.val;
                rl1=rl1.next;
            }
            if(rl2!=null)
            {
                sum+=rl2.val;
                rl2=rl2.next;
            }
            carry=sum/10;
            result.next=new ListNode(sum%10);
            result=result.next;

        }
        return reverse(ans.next);
        
    }
    public ListNode reverse(ListNode node)
    {
        ListNode cur=node;
        ListNode prev=null;
        ListNode next_node=null;
        while(cur!=null)
        {
            next_node=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next_node;

        }
        return prev;
    }
}