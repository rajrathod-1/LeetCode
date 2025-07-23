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
        if(head == null) return null;
        int count = 0;
        ListNode temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        if(n == count)
        {
            ListNode newhead = head.next;
            return newhead;
        }

        int remaining = count - n;
        temp = head;
        while(remaining >1 )
        {
            remaining--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}