class MinStack {

    Stack<Integer> st;
    public MinStack() {
        st = new Stack<Integer>();
    }
    
    public void push(int value) {
        st.push(value);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i: st)
        {
            min = Math.min(min, i);
        }
        return min;
    }
}
