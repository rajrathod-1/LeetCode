class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = findMax(piles);
        int hours = end;

        while(start <= end)
        {
            int mid = (start + end)/2;
            hours = findHours(piles, mid);
            
            if(hours > h)
            {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }


    private int findMax(int[] piles)
    {
        int max = Integer.MIN_VALUE;
        for(int i : piles)
        {
            max = Math.max(max, i);
        }
        return max;
    }

    private int findHours(int[] piles, int mid)
    {
        int total = 0;
        for(int i: piles)
        {
            total += Math.ceil((double)i/mid);
        }
        return total;
    }
}