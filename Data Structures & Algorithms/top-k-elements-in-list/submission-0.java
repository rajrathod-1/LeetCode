class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i: nums)
        {
            hashMap.put(i, hashMap.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        int[] result = new int[k];
        for(int i = 0; i < k; i++)
        {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
