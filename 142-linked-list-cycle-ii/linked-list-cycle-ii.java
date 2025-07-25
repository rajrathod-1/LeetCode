/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode entry = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
            {
                while(entry != slow)
                {
                    entry = entry.next;
                    slow = slow.next;
                }
                return slow;
            }

        }
        return null;
    }
}