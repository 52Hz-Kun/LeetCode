/**
 * 304. 二维区域和检索 - 矩阵不可变
 * 给定一个二维矩阵 matrix，以下类型的多个请求：
 *
 * 计算其子矩形范围内元素的总和，该子矩阵的 左上角 为 (row1, col1) ，右下角 为 (row2, col2) 。
 * 实现 NumMatrix 类：
 *
 * NumMatrix(int[][] matrix) 给定整数矩阵 matrix 进行初始化
 * int sumRegion(int row1, int col1, int row2, int col2) 返回 左上角 (row1, col1) 、右下角 (row2, col2) 所描述的子矩阵的元素 总和 。
 */
public class Q304 {
}
class NumMatrix {
    int[][] res;
    public NumMatrix(int[][] matrix) {
        int[][] temp = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 1; i < temp.length; i++) {
            for (int j = 1; j < temp[0].length; j++) {
                temp[i][j] = temp[i][j - 1] + temp[i - 1][j] - temp[i - 1][j - 1] + matrix[i - 1][j -1];
            }
        }
        res = temp;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return res[row2 + 1][col2 + 1] + res[row1][col1] - res[row2 + 1][col1] - res[row1][col2 + 1];
    }
}
