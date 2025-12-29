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

        if(head == null || (head.next == null && n == 1))
            return null;

        int size = 0;

        ListNode newHead = head;
        while(newHead != null)
        {
            size++;
            newHead = newHead.next;
        }
        if(size == n)
        {
            return head.next;
        }
        ListNode curr = head;
        ListNode prev = null;
        size = size - n;
        for(int i =0; i < size; i++)
        {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
        return head;
    }
}