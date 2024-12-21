class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int num: nums)
        {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for(HashMap.Entry<Integer, Integer> entry: count.entrySet())
        {
            if(entry.getValue() > nums.length/2)
            {
                return entry.getKey();
            }
        }

        return -1;
        
    }
}