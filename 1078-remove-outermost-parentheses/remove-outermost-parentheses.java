class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder temp = new StringBuilder();
        int count = 0;
        for(char c: s.toCharArray())
        {
            if(c == '(')
            {
                if(count > 0)
                    temp.append(c);
                count++;
            }
            else if(c == ')')
            {
                count--;
                if(count > 0)
                    temp.append(c);
            }
        }

        return temp.toString();

    }
}