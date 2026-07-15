class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] store = new int[position.length][2];
        for(int i = 0; i < store.length; i++)
        {
            store[i][0] = position[i];
            store[i][1] = speed[i];
        }

        Arrays.sort(store, (a,b) -> a[0] - b[0]);
        Stack<Double> st = new Stack<>();

        for(int i = store.length - 1; i >= 0; i--)
        {
            double distance = (double)(target - store[i][0])/store[i][1];
            st.push(distance);

            if(st.size() > 1 && st.peek() <= st.get(st.size() - 2))
            {
                st.pop();
            }
        }
        return st.size();
    }
}
