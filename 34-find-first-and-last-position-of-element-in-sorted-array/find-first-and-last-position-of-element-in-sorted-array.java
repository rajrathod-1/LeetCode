class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = start(nums, target);
        int end = end(nums, target);
        int[] arr = {start, end};
        return arr;
    }

    int start(int[] nums, int target)
    {
        int s = 0;
        int e = nums.length -1;

        int mid = 0;
        int index = -1;
        while(s <= e)
        {
            mid = s + (e - s)/2;
            if(target <= nums[mid])
            {
                if(nums[mid] == target)
                    index = mid;
                e = mid -1;
            }

            else{
                s = mid + 1;
            }
        }

        return index;
    }

    int end(int[] nums, int target)
    {
        int s = 0;
        int e = nums.length - 1;

        int mid = 0;
        int index = -1;
        while(s <= e)
        {
            mid = s + (e - s)/2;

            if(target >= nums[mid])
            {
                if(nums[mid] == target)
                    index = mid;
                s = mid + 1;
            }

            else{
                e = mid - 1;
            }
        }
        return index;
    }
}