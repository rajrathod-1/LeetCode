class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;
        long mid;
        int ans = 0; // Changed from long long int to int since ans should be within int range
        
        while (s <= e) {
            mid = s + (e - s) / 2;
            long square = mid * mid;
            
            if (square == x) {
                return (int) mid; // Cast to int since we need to return an int
            }
            
            if (square < x) {
                ans = (int) mid; // Cast to int
                s = (int) mid + 1; // Cast to int
            } else {
                e = (int) mid - 1; // Cast to int
            }
        }
        
        return ans;
    }
}
