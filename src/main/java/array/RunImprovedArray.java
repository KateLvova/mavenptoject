package array;

public class RunImprovedArray {
    public static void main(String[] args) {
        ImprovedArray ia = new ImprovedArrayImpl();
        ia.add(5);
        ia.add(-10);
        ia.add(15);
        ia.add(0);

        System.err.println("SIZE: " + ia.size());

        int index = 3;
        System.err.println("ELEMENT WITH INDEX '" + index + "' is '" + (int) ia.get(index) + "'");
    }
}
