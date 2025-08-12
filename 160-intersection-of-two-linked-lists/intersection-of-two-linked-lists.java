/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        HashSet<ListNode> check = new HashSet<>();
        while(headA != null)
        {
            if(!check.contains(headA))
                check.add(headA);
            else
                return headA;
            headA = headA.next;
        }
        while(headB != null)
        {
            if(!check.contains(headB))
                check.add(headB);
            else
                return headB;
            headB = headB.next;
        }
        return null;
    }
}