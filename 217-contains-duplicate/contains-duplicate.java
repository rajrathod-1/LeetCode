class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int num: map.values())
        {
            if(num > 1)
                return true;
        }

        return false;
    }
}