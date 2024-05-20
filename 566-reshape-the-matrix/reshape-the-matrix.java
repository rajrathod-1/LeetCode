class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        ArrayList<Integer> temp = new ArrayList<>();

        int row = mat.length;
        int cols = mat[0].length;

        if((row*cols) != (r*c))
            return mat;
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[i].length; j++)
            {
                temp.add(mat[i][j]);
            }
        }
        

        int[][] newMat = new int[r][c];
        int count = 0;

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                newMat[i][j] = temp.get(count);
                count++;
            }
        }
        return newMat;
        
    }
}