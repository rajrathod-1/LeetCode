class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[10];

        for(int i =0; i < board.length; i++)
        {
            for(int j =0; j < board[0].length; j++)
            {
                if(board[i][j] == '.')
                    continue;
                int digit = board[i][j] - '0';
                rows[digit]++;
                if(rows[digit] > 1)
                    return false;
            }
            rows = new int[10];
        }

        //for columns
        int[] cols = new int[10];

        for(int i =0; i < board.length; i++)
        {
            for(int j =0; j < board[0].length; j++)
            {
                if(board[j][i] == '.')
                    continue;
                int digit = board[j][i] - '0';
                cols[digit]++;
                if(cols[digit] > 1)
                    return false;
            }
            cols = new int[10];
        }

        //for boxes
        int[] boxes = new int[10];
        for(int i =0; i < board.length; i+=3)
        {
            for(int j =0; j < board[0].length; j+= 3)
            {
                for(int k = i; k < i+ 3; k++)
                {
                    for(int l =j; l < j + 3; l++)
                    {
                        if(board[k][l] == '.')
                            continue;
                        int digit = board[k][l] - '0';
                        boxes[digit]++;
                        if(boxes[digit] > 1)
                            return false;
                    }
                }
                boxes = new int[10];
            }
        }
        return true;
    }
}