package 旋转图像;

import org.junit.Test;

public class Solution2 {
    @Test
    public void test(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
    public void rotate(int[][] matrix) {
        int l = matrix.length;
        for (int i = 0; i < l / 2; i++) {
            for (int j = 0; j < l; j++) {
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[l - 1 - i][j];
                matrix[l - 1 - i][j] = temp;
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
