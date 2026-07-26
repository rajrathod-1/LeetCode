class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();

        int left = 0;
        int max = 0;
        for(int right = 0; right<s.length(); right++)
        {
            char temp = s.charAt(right);
            while(hashSet.contains(temp))
            {
                hashSet.remove(s.charAt(left));
                left++;
            }
            hashSet.add(temp);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
