class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m*k > bloomDay.length) return -1;
        int max = findMax(bloomDay);
        int low = 0;
        int high = max;
        int mid = -1;

        while(low <= high)
        {
            mid = (low + high)/2;
            int bouquets = maxBouquets(bloomDay, k, mid);
            if(bouquets < m)
            {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
        
    }

    private int findMax(int[] bloomDay)
    {
        int max = Integer.MIN_VALUE;
        for(int i : bloomDay)
        {
            max = Math.max(max, i);
        }
        return max;
    }

    private int maxBouquets(int[] bloomDay, int k, int day)
    {
        int count = 0;
        int bouquets = 0;

        for(int i: bloomDay)
        {
            if(i <= day)
            {
                count++;
                if(count == k)
                {
                    bouquets++;
                    count = 0;
                }
            }
            else
            {
                count = 0;

            }
        }
        return bouquets;

    }
}