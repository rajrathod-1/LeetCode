class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end)/2;
        int ans = nums.length;

        while(start <= end)
        {
            mid = (start + end)/2;
            if(nums[mid] >= target)
            {
                end = mid - 1;
                ans =  mid;
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
        }
        return ans;
    }
}