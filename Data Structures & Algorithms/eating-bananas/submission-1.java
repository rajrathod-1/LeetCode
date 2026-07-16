class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;

        int high = Integer.MIN_VALUE;
        for(int i:piles)
        {
            high = Math.max(high, i);
        }

        int answer = high;
        while(low <= high)
        {
            int mid = (high + low)/2;
            int temp = 0;
            for(int i: piles)
            {
                temp += (int)Math.ceil((double)i/mid);
            }

            if(temp <= h)
            {
                answer = mid;
                high = mid - 1;
            }
            else if(temp > h )
            {
                low = mid + 1;
            }

        
        }
        return answer;
    }
}
