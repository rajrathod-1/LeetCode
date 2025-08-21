class Solution {
    public void reverseString(char[] s) {
        helperFunction(s, 0, s.length - 1);
    }

    public void helperFunction(char[] s, int start, int end)
    {
        if(start > end)
            return;
        
        char swap = s[end];
        s[end] = s[start];
        s[start] = swap;
        helperFunction(s, start+1, end-1);
        
    }
}