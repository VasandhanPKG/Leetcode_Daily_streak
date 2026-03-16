class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode tptr = head;
        while (tptr != null && tptr.next != null) {
            if (tptr.val == tptr.next.val) {
                
                tptr.next = tptr.next.next;
            } else {
               
                tptr = tptr.next;
            }
        }
        return head;
    }
}