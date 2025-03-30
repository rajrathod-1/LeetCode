class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }

        
    }
}