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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode merge = new ListNode(-1);
        ListNode mergeHead = merge;

        while(head1 != null && head2 != null)
        {
            if(head1.val <= head2.val)
            {
                merge.next = head1;
                head1 = head1.next;
                merge = merge.next;
            }
            else
            {
                merge.next = head2;
                head2 = head2.next;
                merge = merge.next;
            }
        }

        while(head1 != null)
        {
            merge.next = head1;
            head1 = head1.next;
            merge = merge.next;
        }

        while(head2 != null)
        {
            merge.next = head2;
            head2 = head2.next;
            merge = merge.next;
        }

        return mergeHead.next;
    }
}