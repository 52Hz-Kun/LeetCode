public class Try {
    public static void main(String[] args) {
        int i1 = 2147483647;
        int i2 = -2147483646;
        if (i1 - i2 > Integer.MAX_VALUE)
        System.out.println(i1 - i2);
    }
}
