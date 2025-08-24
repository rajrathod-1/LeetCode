class Solution {
    public boolean isPowerOfThree(int n) {
        return helper(n, 1);
    }

    boolean helper(int n, int mult)
    {
        if(n == mult)
            return true;
        else if(mult > n/3)
            return false;
        return helper(n, mult * 3);
    }

}