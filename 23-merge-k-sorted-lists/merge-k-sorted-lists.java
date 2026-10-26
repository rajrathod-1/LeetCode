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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(int i = 0; i < lists.length; i++)
        {
            ListNode temp = lists[i];
            while(temp != null)
            {
                pq.add(temp);
                temp = temp.next;
            }
        }

        if(pq.isEmpty())
            return null;

        ListNode ans = pq.poll();
        ListNode dummy = ans;
        while(!pq.isEmpty())
        {
            ans.next = pq.poll();
            ans = ans.next;
        }
        ans.next = null;
        return dummy;
    }
}