class Solution {
    public boolean isPowerOfFour(int n) {
        return helper(n, 1);
    }

    boolean helper(int n, int mult)
    {
        if(n == mult)
            return true;
        else if(mult > n/4)
            return false;
        return helper(n, mult * 4);
    }
}