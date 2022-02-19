package demo;

public class Date {

    public static void main(String[] args) {
        int count = countMonthBeforeNewYear(5);
        System.err.println("There are '" + count + "' months before New Year");

       // System.err.println("There are '" + countMonthBeforeNewYear(5) + "' months before New Year");
    }

    public static int countMonthBeforeNewYear(int currentMonth) {
        return 12 - currentMonth;
    }
}
