class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Set<Integer> consec = new HashSet<>();
        for(int i : nums)
        {
            consec.add(i);
        }

        int max = Integer.MIN_VALUE;
        for(int i: nums)
        {
            int temp = 0;
            int consecNumber = i;
            while(consec.contains(consecNumber))
            {
                temp++;
                consecNumber++;
                max = Math.max(max, temp);
            }
        }
        return max;
    }
}
