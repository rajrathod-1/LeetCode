class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0; // Early return for the edge case when x is 0.
        
        int left = 1; // Start at 1 because we are looking for positive integer square roots.
        int right = x; // Initialize right to x.
        int ans = 0; // This will store our result.
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mid <= x / mid) { // This avoids overflow.
                ans = mid;
                left = mid + 1; // Search the right half.
            } else {
                right = mid - 1; // Search the left half.
            }
        }
        
        return ans;
    }
}
