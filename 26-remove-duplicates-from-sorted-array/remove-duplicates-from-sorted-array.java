class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[temp] != nums[i])
            {
                temp += 1;
                int swap = nums[temp];
                nums[temp] = nums[i];
                nums[i] = swap;
            }
        }
        return temp+1;

    }
}