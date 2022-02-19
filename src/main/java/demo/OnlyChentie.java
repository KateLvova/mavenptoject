package demo;

public class OnlyChentie {

    public static void main(String[] args) {
        int a[] = {1, 2, -2, 0, 3, 6, -5};
        int summa = doSummOnlyChetnie(a);
        System.err.println("Summa: " + summa);
    }

    public static int doSummOnlyChetnie(int[] digits) {
        int summ = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 == 0) {
                summ = summ + digits[i];
            }
        }
        return summ;
    }
}
