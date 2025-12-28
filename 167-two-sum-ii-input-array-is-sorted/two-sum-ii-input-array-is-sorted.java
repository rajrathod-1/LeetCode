class Solution {
    public int[] twoSum(int[] number, int target) {
        int first = 0;
        int last = number.length - 1;

        while(first < last)
        {
            if((number[first] + number[last]) == target)
                return new int[]{first + 1, last + 1};
            
            else if((number[first] + number[last]) < target)
                first++;
            
            else
                last--;
        }

        return new int[]{-1,-1};
    }
}