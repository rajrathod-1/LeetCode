class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        // Add all initially rotten oranges to the queue and count fresh oranges
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // If there are no fresh oranges, return 0
        if (freshCount == 0) return 0;

        int minutes = 0;
        int[] delRow = {-1, 1, 0, 0};
        int[] delCol = {0, 0, -1, 1};

        // Perform BFS to spread the rot
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean hasRotten = false;

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];

                // Explore 4-directionally adjacent cells
                for (int j = 0; j < 4; j++) {
                    int newRow = row + delRow[j];
                    int newCol = col + delCol[j];

                    // Check if the new position is within bounds and contains a fresh orange
                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2; // Mark the orange as rotten
                        queue.add(new int[]{newRow, newCol});
                        freshCount--;
                        hasRotten = true;
                    }
                }
            }

            // If any orange rotted in this iteration, increment the time
            if (hasRotten) {
                minutes++;
            }
        }

        // If there are still fresh oranges left, return -1
        return freshCount == 0 ? minutes : -1;
    }
}