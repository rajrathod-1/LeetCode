class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = -1;
        }

        for(int i =0; i < 2*nums.length; i++)
        {
            int num = nums[i%nums.length];
            while(!stack.isEmpty() && nums[stack.peek()] < num)
            {
                int index = stack.pop();
                result[index] = num;
            }

            if(i < nums.length)
            {
                stack.push(i);
            }
        }

        return result;
    }
}