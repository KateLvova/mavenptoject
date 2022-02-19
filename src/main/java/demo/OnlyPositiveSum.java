package demo;

public class OnlyPositiveSum {

    public static void main(String[] args) {
        int a[] = {1, 2, -2, 0, 3, -5};
        int summa = doSummOnlyPositive(a);
        System.err.println("Summa: " + summa);
    }

    public static int doSummOnlyPositive(int[] digits) {
        int summ = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > 0) {
                summ = summ + digits[i];
            }
        }
        return summ;
    }
}
