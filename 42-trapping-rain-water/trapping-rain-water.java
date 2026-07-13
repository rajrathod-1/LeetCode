class Solution {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int max = 0;
        maxLeft[0] = height[0];
        for(int i =1; i < height.length; i++)
        {
            maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
            
        }

        maxRight[maxRight.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--)
        {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        int filledWater = 0;
        for(int i =1; i < height.length -1; i++)
        {
            filledWater += Math.min(maxRight[i], maxLeft[i]) - height[i];
        }

        return filledWater;
    }
}