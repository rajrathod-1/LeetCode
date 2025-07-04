class Solution {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid = -1;

        while(start <= end)
        {
            mid = (start + end)/2;

            if(nums[mid] == target)
                return mid;
            if(nums[start] <= nums[mid]) //sorted first half
            {
                if(nums[start] <= target && target <= nums[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }

            }
            else
            {
                if(nums[mid] <= target && target <= nums[end])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }

            }
        }
        return -1;
    }
}