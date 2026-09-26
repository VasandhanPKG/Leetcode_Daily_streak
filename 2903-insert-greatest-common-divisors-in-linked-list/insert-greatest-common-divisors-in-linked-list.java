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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
         ListNode cur=head;
         ListNode next_node=null;
         while(cur!=null && cur.next!=null)
         {
            int gcd_a_b=gcd(cur.val,cur.next.val);
            next_node=cur.next;
            cur.next=new ListNode(gcd_a_b);
            cur.next.next=next_node;
            cur=next_node;

         }
         return head;
    }
    public int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}