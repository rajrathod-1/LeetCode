class Solution {
    public int beautySum(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int[] alphaCount = new int[26];
            for(int j = i; j < s.length(); j++)
            {
                alphaCount[s.charAt(j) - 'a']++;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(int k = 0; k < 26; k++)
                {
                    if(alphaCount[k] > 0)
                    {
                        max = Math.max(max, alphaCount[k]);
                        min = Math.min(min, alphaCount[k]);
                    }
                }

                count += max - min;
            }
        }
        return count;
    }
}