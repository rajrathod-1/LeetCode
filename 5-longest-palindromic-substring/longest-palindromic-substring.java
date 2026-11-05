class Solution {
    public String longestPalindrome(String s) {
        String best = "";

        for(int i = 0; i < s.length(); i++)
        {
            String odd = expand(s, i,i);
            String even = expand(s, i , i+ 1);
            if(odd.length() > best.length())
                best = odd;
            if(even.length() > best.length())
                best = even;
        }
        return best;
    }

    private String expand(String s, int l, int r)
    {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r))
        {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}