class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int n: nums)
        {
            set.add(n);
        }

        int ans = 0;
        for(int n: set)
        {
            if(!set.contains(n - 1))
            {
                int current = n;
                int count = 1;
                while(set.contains(current + 1))
                {
                    count++;
                    current++;
                }
                ans = Math.max(ans,count);
            }
        }
        
        return ans;
    }
}