import java.util.ArrayList;

/**
 * 剑指 Offer II 040. 矩阵中最大的矩形
 * 给定一个由 0 和 1 组成的矩阵 matrix ，找出只包含 1 的最大矩形，并返回其面积。
 *
 * 注意：此题 matrix 输入格式为一维 01 字符串数组。
 */

/**
 * 屎山！！！
 */
public class offer40 {
    public int maximalRectangle(String[] matrix) {
        int row = matrix.length;
        int column = matrix[0].length();
        int[][] mat = new int[row][column];
//        int[][] dp = new int[row][column];
        ArrayList<ArrayList<int[]>> dp = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = matrix[i].charAt(j) - '0';
            }
        }
        int[] res = new int[2];
        res[0] = mat[0][0];
        res[1] = res[0];
        ArrayList<int[]> first_row = new ArrayList<>();
        first_row.add(res);
        dp.add(first_row);
        ArrayList<int[]> list1= new ArrayList<>();
        for (int i = 1; i < column; i++) {
            int[] r = new int[2];
            if(mat[0][i] == 1) {
                r[0] = Math.max(1, dp.get(0).get(i - 1)[0] + 1);
                r[1] = 1;
                dp.get(0).add(r);
            }
            else dp.get(0).add(null);
        }

        for (int j = 1; j < row; j++) {
            ArrayList<int[]> everyCol = new ArrayList<>();
            int[] r = new int[2];
            if(mat[j][0] == 1) {
                r[0] = 1;
                r[1] = Math.max(1, dp.get(j - 1).get(0)[1] + 1);
                everyCol.add(r);
            }
            else {
                everyCol.add(new int[]{0, 0});
            }
            dp.add(everyCol);
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                int[] ad = new int[2];
                if (mat[i][j] == 1){
                    ad[0] = Math.max(1, Math.min(dp.get(i - 1).get(j)[0], dp.get(i).get(j - 1)[0]) + 1);
                    ad[1] = Math.max(1, Math.min(dp.get(i - 1).get(j)[1], dp.get(i).get(j - 1)[1]) + 1);
                } else {
                    ad[0] = 0;
                    ad[1] = 0;
                }
                dp.get(i).add(ad);
            }
        }


        return 0;

    }

    public static void main(String[] args) {
        offer40 offer40 = new offer40();
        String[] s = {"011", "111", "010"};
        offer40.maximalRectangle(s);
    }
}
