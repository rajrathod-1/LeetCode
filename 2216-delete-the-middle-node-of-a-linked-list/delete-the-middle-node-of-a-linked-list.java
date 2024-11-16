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

            // Edge case: Single node in the list
        if (head == null || head.next == null) {
            return null;
        }

        // Count the total number of nodes
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Find the middle position
        int middle = count / 2;

        // Traverse to the node just before the middle
        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; i < middle; i++) {
            prev = curr;
            curr = curr.next;
        }

        // Skip the middle node
        prev.next = curr.next;

        return head;
    }
}