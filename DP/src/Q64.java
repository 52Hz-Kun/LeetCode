/**
 * 最小路径和
 */
public class Q64 {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int row = grid.length;
        int column = grid[0].length;
        int[][] sumMap = new int[row][column];
        sumMap[0][0] = grid[0][0];
        for (int i = 1; i < row; i++) {
            sumMap[i][0] = grid[i][0] + sumMap[i - 1][0];
        }
        for (int i = 1; i < column; i++) {
            sumMap[0][i] = grid[0][i] + sumMap[0][i - 1];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                sumMap[i][j] = grid[i][j] + Math.min(sumMap[i - 1][j], sumMap[i][j - 1]);
            }
        }
        return sumMap[row - 1][column - 1];
    }
}
