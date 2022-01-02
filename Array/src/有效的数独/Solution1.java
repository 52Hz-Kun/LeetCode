package 有效的数独;

import org.junit.Test;

import java.util.HashSet;

public class Solution1 {
    @Test
    public void test(){
        char[][] board = {{'8','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.')
                    continue;
                if (!set.add((int) board[i][j]))
                    return false;
            }
            set.clear();
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == '.')
                    continue;
                if (!set1.add((int) board[j][i]))
                    return false;
            }
            set1.clear();
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < board.length / 3; i++) {
            for (int j = 0; j < board.length / 3; j++) {
                for (int k = 0; k < board.length / 3; k++) {
                    for (int l = 0; l < board.length / 3; l++) {
                        if (board[3 * i + k][3 * j + l] == '.')
                            continue;
                        if (!set2.add((int) board[3 * i + k][3 * j + l]))
                            return false;
                    }
                }
                set2.clear();
            }
        }
        return true;
    }
}
