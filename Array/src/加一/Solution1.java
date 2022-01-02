package 加一;

public class Solution1 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n - 1]++; // 先加1
        int num = n - 1;

        while (digits[num] / 10 == 1){ // 如果加到了10，再依次进位处理
                digits[num] %= 10;
                num--;
                if (num == -1){
                int[] dig = new int[digits.length + 1];
                dig[0] = 1;
                return dig;
            }
                digits[num]++;
            }
        return  digits;
    }
}
