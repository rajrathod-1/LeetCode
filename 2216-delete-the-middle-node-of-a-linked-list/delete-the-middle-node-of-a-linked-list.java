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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null)  return null;
        int count = 0;
        ListNode temp = head;

        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        int mid = count/2;

        temp = head;
        while(temp != null)
        {
            mid--;
            if(mid == 0)
            {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return null;
    }
}