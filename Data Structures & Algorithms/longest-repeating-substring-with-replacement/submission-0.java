class Solution {
    public int characterReplacement(String s, int k) {
        int[] alpha = new int[26];

        int left = 0;
        int ans = 0;
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++)
        {
            char c = s.charAt(right);
            alpha[c - 'A']++;
            maxFreq = Math.max(maxFreq, alpha[c-'A']);

            while((right - left + 1) - maxFreq > k)
            {
                alpha[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, (right - left + 1));
        }
        return ans;
    }
}
