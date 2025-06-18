class Solution {
    public int singleNonDuplicate(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i: nums)
        {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        for(HashMap.Entry<Integer, Integer> entry : count.entrySet())
        {
            if(entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }

        return -1;
        
    }
}