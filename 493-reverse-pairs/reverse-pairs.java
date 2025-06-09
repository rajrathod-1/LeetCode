class Solution {

    public int mergeSort(int[] nums, int left, int right)
    {
        int count = 0;
        if(left >= right) return count;

        int mid = (left + right)/2;
        count += mergeSort(nums, left, mid);
        count += mergeSort(nums, mid+1, right);
        count += countPairs(nums, left, mid, right);
        merge(nums, left, mid, right);
        return count;
    }

    public int countPairs(int[] arr, int low, int mid, int high)
    {
        int right = mid + 1;
        int count = 0;
        for(int i =low; i <= mid; i++)
        {
            while (right <= high && arr[i] > 2L * arr[right]) right++;
            count += (right - (mid + 1));
        }
        return count;
    }

    void merge(int[] nums, int low, int mid, int high)
    {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int index = 0;

        while(left <= mid && right <= high)
        {
            if(nums[left] <= nums[right])
            {
                temp[index++] = nums[left++];
            }
            else{
                temp[index++] = nums[right++];
            }
        }

        while(left <= mid)
        {
            temp[index++] = nums[left++];
        }

        while(right <= high)
        {
            temp[index++] = nums[right++];
        }

        for(int i = low, j = 0; i <= high; i++, j++)
        {
            nums[i] = temp[j];
        }
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }


}