class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i: nums)
        {
            if(i != 0)
            {
                temp.add(i);
            }
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(i < temp.size())
                nums[i] = temp.get(i);
            else
                nums[i] = 0;
        }
    }
}