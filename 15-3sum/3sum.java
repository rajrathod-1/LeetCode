class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> setMap= new HashSet<>();

        for(int i =0; i < nums.length; i++)
        {
            Set<Integer> temp = new HashSet<>();
            for(int j =i+1; j < nums.length; j++)
            {
                int third = -(nums[i] + nums[j]);
                if(temp.contains(third))
                {
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(third);
                    Collections.sort(ans);
                    setMap.add(ans);
                }
                temp.add(nums[j]);
            }
        }
        return new ArrayList<>(setMap);
    }
}