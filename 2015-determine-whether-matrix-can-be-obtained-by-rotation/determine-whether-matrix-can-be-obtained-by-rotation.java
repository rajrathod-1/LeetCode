class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        // Rotate the matrix 4 times (0, 90, 180, 270 degrees)
        for (int rotate = 0; rotate < 4; rotate++) {
            // Check if the rotated matrix matches the target
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            // Rotate the matrix
            mat = rotateMatrix(mat);
        }
        // If none of the rotations match, return false
        return false;
    }

    // Helper function to rotate the matrix by 90 degrees
    private int[][] rotateMatrix(int[][] mat) {
        int n = mat.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = mat[n - 1 - j][i];
            }
        }
        return res;
    }
}