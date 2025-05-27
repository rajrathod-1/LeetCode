class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> subMap = new HashMap<>();
        int count = 0;
        int sum = 0;
        subMap.put(0, 1);
        for(int i: nums)
        {
            sum += i;   
            if(subMap.containsKey(sum - k))
            {
                count += subMap.get(sum - k);
            }
            subMap.put(sum, subMap.getOrDefault(sum, 0)+1);
        }

        return count;
        
    }
}