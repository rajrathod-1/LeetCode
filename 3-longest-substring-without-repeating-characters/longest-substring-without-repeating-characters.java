class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0;

        for(int i = 0; i < s.length(); i++)
        {
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j = i; j < s.length(); j++)
            {
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
                if(map.get(c) > 1)
                    break;
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}