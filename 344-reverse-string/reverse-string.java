class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

         reverse(s, start, end);

        
    }
    void reverse(char[] s, int start, int end)
    {
        if(start > end)
            return;
        char temp = s[end];
        s[end] = s[start];
        s[start] = temp;

        reverse(s, start + 1, end - 1);
    }
}