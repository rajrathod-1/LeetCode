class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        int ans = 0;
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' ') 
        {
            i++;
        }

        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+'))
        {
            if(s.charAt(i) == '-')
                sign *= -1;
            i++;
        }


        while(i < s.length() && (s.charAt(i) - '0' <= 9 && s.charAt(i) - '0' >= 0))
        {

            if(ans > ((Integer.MAX_VALUE - (s.charAt(i) - '0'))/10))
            {
                if(sign == -1)
                    return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            ans = (ans * 10) + (s.charAt(i) - '0');
            i++; 
        }

        return ans * sign;
        
    }
}