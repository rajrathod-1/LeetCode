class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] distances = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        
        // Initialize distances and enqueue all 0-cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    distances[i][j] = 0;
                    queue.offer(new int[]{i, j});
                } else {
                    distances[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // Directions for moving up, down, left, and right
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        // Perform BFS
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];

            for (int[] dir : directions) {
                int newX = x + dir[0], newY = y + dir[1];

                // Check boundaries and if a shorter distance is found
                if (newX >= 0 && newX < m && newY >= 0 && newY < n) {
                    if (distances[newX][newY] > distances[x][y]) {
                        distances[newX][newY] = distances[x][y] + 1;
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }
        }

        return distances;
    }
}