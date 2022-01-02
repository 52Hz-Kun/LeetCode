package offer11;

public class Solution {
    public int minArray(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int n1 = numbers[i - 1];
            int n2 = numbers[i];
            if (n2 < n1) return n2;
        }
        return numbers[0];
    }
}
