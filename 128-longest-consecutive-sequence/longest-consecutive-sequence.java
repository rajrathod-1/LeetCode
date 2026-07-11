class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> setArr = new HashSet<>();

        for(int i: nums)
        {
            setArr.add(i);
        }

        int max = 0;
        

        for(int i: setArr)  
        {
            if(!setArr.contains(i-1))
            {
                int temp = i;
                int consec = 0;
                while(setArr.contains(temp))
                {
                    temp++;
                    consec++;
                }
                max = Math.max(max, consec);
            }
        }
        return max;
    }
}