class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans = new int[n][n];
        int row1 = 0, row2 =0, col1 = 0, col2 = 0;
        for(int i =0; i < queries.length; i++)
        {
            row1 = queries[i][0];
            row2 = queries[i][2];
            col1 = queries[i][1];
            col2 = queries[i][3];
            fixingArray(ans, row1, row2, col1, col2);
        }
        return ans;
    }

    void fixingArray(int[][] ans, int row1, int row2, int col1, int col2)
    {
        for(int i = row1; i <= row2; i++ )
        {
            for(int j = col1; j <= col2; j++)
            {
                ans[i][j]++;
            }
        }
    }
}