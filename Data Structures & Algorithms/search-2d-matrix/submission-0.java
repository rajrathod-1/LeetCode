class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = (matrix.length * matrix[0].length) - 1;
        int mid = 0;

        while(start <= end)
        {
            mid = (end + start)/2;
            int row = mid/matrix[0].length;
            int column = mid % matrix[0].length;

            if(matrix[row][column] == target)
                return true;
            else if (matrix[row][column] < target)
                start = mid + 1;
            else if(matrix[row][column] > target)
                end = mid - 1;
        }
        return false;
    }
}
