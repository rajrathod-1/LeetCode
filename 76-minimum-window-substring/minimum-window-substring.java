class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        int missing = t.length();
        int minLen = Integer.MAX_VALUE;
        int bestStart = 0;

        for(char c: t.toCharArray())
        {
            need[c]++;
        }

        int left = 0;
        for(int right = 0; right < s.length(); right++)
        {
            char c = s.charAt(right);
            if(need[c] > 0)
                missing--;
                        
            need[c]--;
            while(missing == 0)
            {
                if(minLen > right - left + 1)
                {
                    bestStart = left;
                    minLen = Math.min(minLen, right - left + 1);
                }
                char d = s.charAt(left);
                need[d]++;
                if(need[d] > 0)
                    missing++;
                left++;
            }

        }

        if(minLen == Integer.MAX_VALUE)
            return "";
        return s.substring(bestStart,  bestStart + minLen);
    }
}