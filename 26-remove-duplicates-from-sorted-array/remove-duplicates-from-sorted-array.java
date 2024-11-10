class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> expectedNums = new ArrayList<>();
        int arrayPointer = 0;
        int pointer = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(pointer != nums[i])
            {
                expectedNums.add(nums[i]);
                pointer = nums[i];

                //swap
                int temp = nums[i];
                nums[i] = nums[arrayPointer];
                nums[arrayPointer] = temp;

                arrayPointer++;
            }
        }

        return expectedNums.size();
        
    }
}