class Solution {
    public void rotate(int[][] matrix) {

        //first transpose
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = i; j < matrix[0].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }

        
        //now we reverse the matrix
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length/2; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - 1 -j];
                matrix[i][matrix.length - 1 -j] = temp; 
            }
        }

        
    }
}