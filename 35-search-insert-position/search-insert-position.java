class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        int mid = 0;
        while(start <= end)
        {
            mid = start + (end - start)/2;
             if(target <= nums[mid])
            {
                ans = mid;
                end = mid - 1;
            }

            else
            {
                start = mid + 1;
            }
        }
        return ans;
    }
}