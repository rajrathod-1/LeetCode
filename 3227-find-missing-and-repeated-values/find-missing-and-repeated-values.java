class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] countArray = new int[grid.length * grid.length + 1];
        int missing = -1;
        int twice = -1;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                countArray[grid[i][j]]++;
            }
        }

        for(int i = 1; i < countArray.length; i++)
        {
            if(countArray[i] == 0)
                missing = i;
            if(countArray[i] == 2)
                twice = i;
        }

        return new int[]{twice, missing};


    }
}