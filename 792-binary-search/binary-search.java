class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int mid = start + (end - start)/2;

        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(nums[mid] == target)
                return mid;
            else if(target < nums[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        
        return -1;
    }
}