class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        int duplicate = Integer.MIN_VALUE;
        int count = 0;
        for(int num: nums)
        {
            if(duplicate != num)
            {
                duplicate = num;
                temp.add(duplicate);
                count++;
            }
        }

        for(int i = 0; i < temp.size(); i++)
        {
            nums[i] = temp.get(i);
        }
        return count;
        
    }
}