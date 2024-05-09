class Solution {
    public int diagonalSum(int[][] mat) {
        int leftrow = 0;
        int leftcolumn = 0;
        int rightrow = 0;
        int rightcolumn = mat.length  -1;

        int sum = 0;
        for(int i =0; i < mat.length ; i++)
        {
                sum += mat[leftrow][leftcolumn];
                leftrow++;
                leftcolumn++;
                sum += mat[rightrow][rightcolumn];
                rightrow++;
                rightcolumn--;
        }
        if(mat.length %2 !=0)
        {
            sum -= mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}