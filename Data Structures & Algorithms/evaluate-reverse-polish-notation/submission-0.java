class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for(int i =0; i < tokens.length; i++)
        {
            String temp = tokens[i];
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))
            {
                int eval = 0;
                int a = st.pop();
                int b = st.pop();
                if(temp.equals("+"))
                {
                    eval += (b + a);
                }
                else if(temp.equals("-"))
                {
                    eval += (b - a);
                }
                else if(temp.equals("*"))
                {
                    eval += (b * a);
                }
                else if(temp.equals("/"))
                {
                    eval += (b / a);
                }
                st.push(eval);
            }
            else
            {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}
