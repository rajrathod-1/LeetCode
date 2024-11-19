class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num: nums2)
        {
            while(!stack.isEmpty() && stack.peek() < num)
            {
                int smallerNum = stack.pop();
                map.put(smallerNum, num);
            }
            stack.push(num);
        }

        while(!stack.isEmpty())
        {
            int remaningNum = stack.pop();
            if(stack.isEmpty())
            {
                map.put(remaningNum, -1);
            }
            else{
                map.put(remaningNum, -1);
            }
        }

        int[] result = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++)
        {
            result[i] = map.get(nums1[i]);
        }
        return result;

        
    }
}