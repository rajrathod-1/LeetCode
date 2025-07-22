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
        ArrayList<Integer> palindrome = new ArrayList<>();
        ListNode temp = head;

        while(temp != null)
        {
            palindrome.add(temp.val);
            temp = temp.next;
        }

        int start = 0;
        int end = palindrome.size() - 1;
        while (start <= end)
        {
            if(palindrome.get(start) != palindrome.get(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}