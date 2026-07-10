class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] temp = new int[board.length];

        //for rows
        for(int i =0; i < board.length; i++)
        {
            for(int j =0; j < board[0].length; j++)
            {
                if(board[i][j] == '.')
                    continue;

                int index = board[i][j] - '1';

                temp[index]++;
                if(temp[index] >= 2)
                    return false;
            }
            temp = new int[board.length];
        }

        //for column
        for(int i =0; i < board.length; i++)
        {
            for(int j =0; j < board[0].length; j++)
            {
                if(board[j][i] == '.')
                    continue;
                    
                int index = board[j][i] - '1';
                temp[index]++;
                if(temp[index] >= 2)
                    return false;
            }
            temp = new int[board.length];
        }

        for(int row = 0; row < 9; row += 3)
        {
            for(int col = 0; col < 9; col += 3)
            {
                temp = new int[9];

                for(int i = row; i < row + 3; i++)
                {
                    for(int j = col; j < col + 3; j++)
                    {
                        if(board[i][j] == '.')
                            continue;

                        int index = board[i][j] - '1';

                        temp[index]++;

                        if(temp[index] >= 2)
                            return false;
                    }
                }
            }
        }

    return true;
    }
}