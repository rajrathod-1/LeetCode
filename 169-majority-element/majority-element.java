class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int i =0; i < nums.length; i++)
        {
            temp.put(nums[i], temp.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        for(int i: temp.keySet())
        {
            if(temp.get(i) > nums.length/2)
                max = i;
        }
            return max;
    }

}