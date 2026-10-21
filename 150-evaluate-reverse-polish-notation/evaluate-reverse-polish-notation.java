class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i < tokens.length; i++)
        {
            String token = tokens[i];
            if((token.equals("+") ||token.equals("-") || token.equals("*") || token.equals("/")) && !stack.isEmpty())
            {
                int first = stack.pop();
                int second = stack.pop();
                int answer = 0;
                if(token.equals("+"))
                {
                    answer = second + first;
                }
                else if(token.equals("-"))
                {
                    answer = second - first;
                }
                else if(token.equals("*"))
                {
                    answer = second * first;
                }
                else if(token.equals("/"))
                {
                    answer = second / first;
                }
                stack.push(answer);

            }
            else 
            {
                int digit = Integer.parseInt(token);
                stack.push(digit);
            }
        }
        return stack.peek();
    }
}