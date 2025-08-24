class Solution {
    public boolean isPowerOfTwo(int n) {
        return helper(n,1);
    }

    boolean helper(int n, int multiplier)
    {
        if(n == multiplier)
            return true;
        else if(multiplier > n/2)
            return false;
        return helper(n, multiplier * 2);
    }
}