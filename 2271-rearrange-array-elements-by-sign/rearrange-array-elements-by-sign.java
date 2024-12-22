class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int num: nums)
        {
            if(num < 0)
                neg.add(num);
            else
                pos.add(num);
        }        
        int count = 0;
        for(int i = 0; i < neg.size(); i++)
        {
            nums[count] = pos.get(i);
            count+= 1;
            nums[count] = neg.get(i);
            count+=1;

        }
        return nums;
    }
}