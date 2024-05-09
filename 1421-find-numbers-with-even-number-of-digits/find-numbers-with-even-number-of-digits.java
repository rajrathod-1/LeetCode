class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i =0; i < nums.length; i++)
        {
            int temp = 0;
            int newTemp = nums[i];
            while(newTemp != 0)
            {
                newTemp /= 10;
                temp++;
            }
            if(temp %2 == 0)
            {
                count++;
            }
            
        }
        return count;
    }
}