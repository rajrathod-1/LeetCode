class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = end + 1;

        int mid = 0;
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(target == nums[mid])
            {
                return mid;
            }
            else if(target < nums[mid])
            {
                index = mid;
                end = mid - 1;
            }

            else
            {
                start = mid + 1;
            }
        }
        return index;
    }
}