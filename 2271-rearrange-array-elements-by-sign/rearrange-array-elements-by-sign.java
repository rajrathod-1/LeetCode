class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg =  new int[nums.length/2];
        int posCount = 0;
        int negCount = 0;
        for(int i =0; i < nums.length; i++)
        {
            if(nums[i] >= 0)
            {
                pos[posCount] = nums[i];
                posCount++;
            }
            else{
                neg[negCount] = nums[i];
                negCount++;
            }
        }
        posCount = 0;
        negCount = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i % 2 == 0)
            {
                nums[i] = pos[posCount];
                posCount++;
            }
            else
            {
                nums[i] = neg[negCount];
                negCount++;
            }
        }

        return nums;
        
    }
}