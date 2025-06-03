class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> ans = new HashSet<>();
        
        for(int i =0; i < nums.length; i++)
        {
            Set<Integer> map = new HashSet<>();
            for(int j = i + 1; j < nums.length; j++)
            {
                int third = -(nums[i] + nums[j]);
                if(map.contains(third))
                {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                map.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}