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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode result=new ListNode(-1);
        ListNode temp2=result;
        temp=temp.next;
        while(temp!=null)
        {
            int sum=0;
            while(temp!=null && temp.val!=0)
            {
                sum+=temp.val;
                temp=temp.next;
            }
            temp2.next=new ListNode(sum);
            temp2=temp2.next;
            temp=temp.next;
        }
        return result.next;
        
    }
}