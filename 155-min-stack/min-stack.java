class Pair{
    int value;
    int min;

    public Pair(int value, int min)
    {
        this.value = value;
        this.min = min;
    }
}
class MinStack {
    private Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
        
    }
    
    public void push(int val) {
        if(stack.isEmpty())
        {
            stack.push(new Pair(val, val));
        }
        else{
            int currMin = stack.peek().min;
            stack.push(new Pair(val, Math.min(currMin, val)));
        }
        
    }
    
    public void pop() {
        if(!stack.isEmpty())
        {
            stack.pop();
        }
    }
    
    public int top() {
       return stack.peek().value;
    }
    
    public int getMin() {
       return stack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */