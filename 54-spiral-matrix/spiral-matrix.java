class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int topCol = 0;
        int bottomCol = matrix[0].length - 1;

        ArrayList<Integer> printArray = new ArrayList<>();

        while(topRow <= bottomRow && topCol <= bottomCol)
        {
            //traverse from left to right
            for(int i = topCol; i <= bottomCol; i++)
            {
                printArray.add(matrix[topRow][i]);
            }
            topRow++;

            //traverse right Column
            for(int i = topRow; i <= bottomRow; i++)
            {
                printArray.add(matrix[i][bottomCol]);
            }

            bottomCol--;

            //traverse bottom row
            if(topRow <= bottomRow)
            {
                for(int i = bottomCol; i>= topCol; i--)
                {
                    printArray.add(matrix[bottomRow][i]);
                }
                bottomRow--;
            }

            
            if(topCol <= bottomCol)
            {
                for(int i = bottomRow; i >= topRow; i--)
                {
                    printArray.add(matrix[i][topCol]);
                }
                topCol++;
            }
        }

        return printArray;
        
    }
}