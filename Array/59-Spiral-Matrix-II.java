// 59. Spiral Matrix II (Medium)
// https://leetcode.com/problems/spiral-matrix-ii/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (num <= n * n) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Traverse downwards
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Traverse from right to left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // Traverse upwards
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix;
    }
}