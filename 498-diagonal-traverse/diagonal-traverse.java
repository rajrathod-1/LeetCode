class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) return new int[0];
        int n = mat.length;
        int m = mat[0].length;
        boolean up = true;
        int[] ans = new int[n * m];
        int idx = 0;
        int r = 0;
        int c = 0;

        while(idx < n * m)
        {
            ans[idx++] = mat[r][c];
            if(up)
            {
                if(c == m-1)
                {
                    r++;
                    up = false;
                }
                else if(r == 0)
                {
                    c++;
                    up = false;
                }
                else{
                    r--;
                    c++;
                }
            }
            else
            {
                if(r == n-1)
                {
                    c++;
                    up = true;
                }
                else if(c == 0)
                {
                    r++;
                    up = true;
                }
                else
                {
                    c--;
                    r++;
                }
            }
        }
        return ans;
    }
}