class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = findMax(piles);

        int low = 1;
        int high = max;
        int mid = -1;


        while(low <= high)
        {
            mid = (low + high)/2;
            int hours = calculateHours(mid, piles);

            if(hours > h)
            {
                low = mid + 1;
            }
            if (hours <= h)
            {
                high = mid - 1;
            }
        }

        return low;
    }

    private int findMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i:arr)
        {
            max = Math.max(max, i);
        }
        return max;
    }

    private int calculateHours(int hour, int[] arr)
    {
        int requiredHour = 0;
        for(int i : arr)
        {
            requiredHour += Math.ceil((double)i/ (double)hour);
        }
        return requiredHour;
    }
}