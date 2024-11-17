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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;
        while(temp != null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }

        int start = 0;
        int end = (arr.size() -1);

        while(start <= end)
        {
            int startVal = arr.get(start);
            int endVal = arr.get(end);
            if(startVal != endVal)
            {
                return false;
            }
            start++;
            end--;
        }
        return true;

        
    }
}