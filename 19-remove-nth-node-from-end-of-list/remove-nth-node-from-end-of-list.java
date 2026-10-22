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
        int size = 0;
        ListNode temp = head;
        ListNode prev = temp;

        while(temp != null)
        {
            size++;
            prev = temp;
            temp = temp.next;
        }

        if(n == size)
        {
            ListNode newHead = head.next;
            return newHead;
        }

        int remaining = size - n - 1;
        temp = head;
        for(int i =0; i < remaining; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;


    }
}