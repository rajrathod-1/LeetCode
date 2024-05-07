class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < gain.length; i++)
        {
            count += gain[i];
            if(max < count)
            {
                max = count;
            }
        }
        if (max < 0)
            return 0;
        return max;
    }
}