class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length -1;
        int sum =0;
        while(first < last)
        {
            sum = numbers[first] + numbers[last];
            if(sum == target)
                return new int[]{first + 1, last + 1};
            if(sum < target)
                first++;
            if(sum > target)
                last--;
        }
        return new int[]{-1, -1};
    }
}
