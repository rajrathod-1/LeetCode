class Solution {
    public void moveZeroes(int[] nums) {
        int pointer = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                //swap
                int temp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = temp;

                pointer++;
            }
        }

        for(int i = pointer; i < nums.length; i++)
        {
            nums[i] = 0;
        }
        
    }
}