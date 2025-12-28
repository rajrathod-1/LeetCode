class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> map = new HashSet<>();
        int left =0;
        int max = 0;

        for(int right = 0; right < s.length(); right++)
        {
            char c = s.charAt(right);
            while(map.contains(c))
            {
                map.remove(s.charAt(left));
                left++;
            }
            map.add(c);
            max = Math.max(max, right - left + 1);
        }
        return max;

    }
}