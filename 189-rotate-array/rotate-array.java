class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[nums.length];

        for(int i = 0; i < temp.length; i++)
        {
            temp[i] = nums[i];
        }

        for(int i = 0; i < k; i++)
        {
            nums[i] = temp[nums.length - k + i];
        }

        for(int i = k; i < nums.length; i++)
        {
            nums[i] = temp[i - k];
        }
    }

}