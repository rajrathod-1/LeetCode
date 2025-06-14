class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0)
            return new int[]{-1, -1};

        int start = 0;
        int end = nums.length - 1;
        int first = -1;
        int mid = -1;


        while(start <= end)
        {
            mid = (start + end)/2;
            if(nums[mid] == target)
            {
                first = mid;
            }
            if(nums[mid] > target)
            {
                end = mid - 1;
            }
            if(nums[mid] <= target)
            {
                start = mid + 1;
            }
            
        }


        start = 0;
        end = nums.length - 1;
        int second = -1;
        mid = -1;


        while(start <= end)
        {
            mid = (start + end)/2;
            if(nums[mid] == target)
            {
                second = mid;
            }
            if(nums[mid] >= target)
            {
                end = mid - 1;
            }
            if(nums[mid] < target)
            {
                start = mid + 1;
            }
            
        }

        return new int[]{second, first};

    }
}