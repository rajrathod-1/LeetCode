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
        if(head == null)
            return null;
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp != null)
        {
            st.push(temp);
            temp = temp.next;
        }

        if(n == st.size())
            return head.next;

        for(int i =0; i < n; i++)
        {
            temp = st.pop();
        }

        st.peek().next = temp.next;
        return head;
    }
}
