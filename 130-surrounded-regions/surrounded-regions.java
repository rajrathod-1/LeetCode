class Solution {
    public void solve(char[][] board) {
        
        if(board == null || board.length == 0)
            return;
        
        int rows = board.length;
        int col = board[0].length;

        for(int r =0; r < rows; r++)
        {
            if(board[r][0] == 'O')
            {
                dfs(board, r, 0, rows, col);

            }
            if(board[r][col - 1] == 'O')
            {
                dfs(board, r, col -1, rows, col);
            }
        }

        for(int c = 0; c < col; c++)
        {
            if(board[0][c] == 'O')
            {
                dfs(board, 0, c, rows, col);
            }
            if(board[rows - 1][c] == 'O')
            {
                dfs(board, rows - 1, c, rows, col);
            }
        }

        for(int r = 0; r < rows; r++)
        {
            for(int c = 0; c < col; c++)
            {
                if(board[r][c] == 'O')
                {
                    board[r][c] = 'X';
                }
                else if(board[r][c] == 'V')
                {
                    board[r][c] = 'O';
                }
            }
        }

    }

    public void dfs(char[][] board, int r, int c, int rows, int cols)
    {
        if(r < 0 || r >= rows || c < 0 || c >= cols || board[r][c] != 'O')
        {
            return;
        }
        board[r][c] = 'V';
        dfs(board, r + 1, c, rows, cols);
        dfs(board, r - 1, c, rows, cols);
        dfs(board, r , c + 1, rows, cols);
        dfs(board, r , c - 1, rows, cols);

    }
}