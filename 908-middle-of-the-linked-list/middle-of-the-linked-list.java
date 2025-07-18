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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        if(head == null) return null;
        ListNode temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        int mid = count/2;
        int tempCount = 0;
        temp = head;
        while(mid != tempCount )
        {
            temp = temp.next;
            tempCount++;
        }
        return temp;
        
    }
}