
/**
 * 不同路径
 */
public class Q62 {
    public int uniquePaths(int m, int n) {
        int[][] numMap = new int[m][n];
        for (int i = 0; i < m; i++) {
            numMap[i][0] = m;
        }
        for (int j = 0; j < n; j++) {
            numMap[0][j] = n;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                numMap[i][j] = numMap[i - 1][j] + numMap[i][j - 1];
            }
        }
        return numMap[m - 1][n -1];
    }
}
