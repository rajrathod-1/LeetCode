class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
Set<List<Integer>> resultSet = new HashSet<>();
        
        // Sort the array to help avoid duplicates and make two-pointer search easier
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Use a HashSet to store possible pairs for each element nums[i]
            Set<Integer> hashSet = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);
                
                // Check if the required third element exists in the hashSet
                if (hashSet.contains(third)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    // Sort the triplet to avoid duplicates
                    Collections.sort(triplet);
                    resultSet.add(triplet);
                }
                
                // Add the current element to the set for future pairs
                hashSet.add(nums[j]);
            }
        }
        
        // Convert the set of unique triplets to a list
        return new ArrayList<>(resultSet);
    }
}