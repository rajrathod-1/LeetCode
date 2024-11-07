class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return helper(s,0);
        
        
    }

    public boolean helper(String s, int i)
    {
        if(i >= s.length()/2) return true;

        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;

        return helper(s, i+1);
    }
}