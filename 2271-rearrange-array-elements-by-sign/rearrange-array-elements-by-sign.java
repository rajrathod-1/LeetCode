class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posPointer = 0;
        int negPointer = 1;
        
        int[] altArray = new int[nums.length];

        for(int i: nums)
        {
            if(i >= 0)
            {
                altArray[posPointer] = i;
                posPointer += 2;
            }
            else
            {
                altArray[negPointer] = i;
                negPointer += 2;
            }
        }

        return altArray;
    }
}