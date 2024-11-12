class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count the occurrences of 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }

        // Fill the array with 0s, then 1s, then 2s based on the counts
        int index = 0;

        // Fill with 0s
        for (int i = 0; i < count0; i++) {
            nums[index++] = 0;
        }

        // Fill with 1s
        for (int i = 0; i < count1; i++) {
            nums[index++] = 1;
        }

        // Fill with 2s
        for (int i = 0; i < count2; i++) {
            nums[index++] = 2;
        }
    }
}