class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> spiral = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;


        while ((left < right) && (top < bottom)){

            //get every i in the top row
            for(int i = left; i < right; i++)
            {
                spiral.add(matrix[top][i]);
            }
            top += 1;

            //get every i in the right col
            for(int i = top; i < bottom; i++)
            {
                spiral.add(matrix[i][right - 1]);
            }
            right -= 1;

            if(!((left < right) && (top < bottom)))
                break;
            
            //get every i in the bottom row
            for(int i = right - 1; i > left - 1; i--)
            {
                spiral.add(matrix[bottom - 1][i]);
            }
            bottom -= 1;

            //for every i in the left col
            for(int i = bottom - 1; i > top - 1; i--)
            {
                spiral.add(matrix[i][left]);
            }
            left += 1;
        }
        return spiral;
    }
}