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
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        
        ListNode temp = head;
        while(temp != null)
        {
            st.push(temp);
            temp = temp.next;
        }

        int n = st.size();
        ListNode original = head;
        for(int i =0; i < n/2; i++)
        {
            ListNode next = original.next;
            original.next = st.pop();
            original = original.next;
            original.next = next;
            original = original.next;

        }
        original.next = null;
    }
}
