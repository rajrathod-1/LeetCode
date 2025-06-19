class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int ans = 0;
        int mid = -1;
        if(x == 0 || x == 1) return x;
        while(start<=end)
        {
            mid = (start + end)/2;
            long mult = (long) mid * mid;
            if(mult == x)
            {
                return mid;
            }

            if(mult < x)
            {
                ans = mid;
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }

        }

        return ans;
    }
}