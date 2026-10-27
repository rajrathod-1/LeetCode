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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode groupPrev = dummy;

        while(true)
        {
            ListNode kthNode = getKthNode(groupPrev, k);
            if(kthNode == null)
                break;
            ListNode groupNext = kthNode.next;

            ListNode prev = kthNode.next;
            ListNode curr = groupPrev.next;
            while(curr != groupNext)
            {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode temp = groupPrev.next;
            groupPrev.next = kthNode;
            groupPrev = temp;
        }
        return dummy.next;
    }

    public ListNode getKthNode(ListNode groupPrev, int k)
    {
        while(groupPrev != null && k > 0)
        {
            groupPrev = groupPrev.next;
            k--;
        }
        return groupPrev;
    }
}