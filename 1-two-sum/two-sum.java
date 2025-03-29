class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int i =0; i < nums.length; i++)
        {
            if(temp.containsKey(target - nums[i]))
            {
                return new int[]{i, temp.get(target - nums[i])};
            }

            if(!temp.containsKey(target - nums[i]))
            {
                temp.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }
}