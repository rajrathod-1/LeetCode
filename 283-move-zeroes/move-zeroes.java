class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length <= 1)
            return;
        int place = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[place];
                nums[place] = temp;
                place++;
            }
        }
        
    }
}
