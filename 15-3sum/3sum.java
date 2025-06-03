class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> ans = new HashSet<>();
        for(int i = 0; i < nums.length -2; i++)
        {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0)
                {
                    k--;
                }
                else if( sum < 0)
                {
                    j++;
                }
                else{
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    Collections.sort(temp);
                    ans.add(temp);
                    j++;
                    k--;
                }
            }
        }

        return new ArrayList<>(ans);
    }
}