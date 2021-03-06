package offer04;

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns - 1;
        while (row < rows && column >= 0){
            if (matrix[row][column] > target) column--;
            else if (matrix[row][column] < target) row++;
            else return true;
        }
        return false;
    }
}
