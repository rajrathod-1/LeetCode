class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;

        while( start < end)
        {
            int min = Math.min(height[end], height[start]);
            int distance = end - start;
            int area = distance * min;
            maxArea = Math.max(area, maxArea);
            if(height[start] < height[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return maxArea;
    }
}