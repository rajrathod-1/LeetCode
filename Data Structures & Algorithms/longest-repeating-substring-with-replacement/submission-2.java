class Solution {
    public int characterReplacement(String s, int k) {
        int[] alpha = new int[26];
        int left = 0;
        int max = 0;
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++)
        {
            alpha[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, alpha[s.charAt(right) - 'A']);
            while(right - left + 1 - maxFreq > k)
            {
                alpha[s.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
