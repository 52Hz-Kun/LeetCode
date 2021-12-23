package 旋转图像;

import org.junit.Test;

import java.util.Arrays;

public class Solution1 {
    @Test
    public void test(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        rotate(matrix);
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
    }

    public void rotate(int[][] matrix) {
        int l = matrix.length;
        if (l % 2 == 1)
        {
            for (int i = 0; i < (l+1) / 2; i++) {
                for (int j = 0; j < (l-1) / 2; j++) {
                    r(matrix, i, j);
                }
            }
        }
        else{
            for (int i = 0; i < Math.ceil(l / 2); i++) {
                for (int j = 0; j < Math.floor(l / 2); j++) {
                    r(matrix, i, j);
                }
            }
        }
    }
    public void r(int[][] matrix, int row_, int column_){
        int row = row_;
        int column = column_;
        int temp_old = matrix[row][column];
        int temp_new;

        for (int i = 0; i < 4; i++) {
            int row_t = row;
            int column_t = column;
            row = column_t;
            column = matrix.length - row_t - 1;
            temp_new = matrix[row][column];
            matrix[row][column] = temp_old;
            temp_old = temp_new;
        }
    }
}
