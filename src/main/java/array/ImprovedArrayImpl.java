package array;

public class ImprovedArrayImpl implements ImprovedArray {
    public Object[] elements;

    @Override
    public void add(Object element) {
        if (elements == null) {
            elements = new Object[1];
            elements[0] = element;
        } else {
            int newSize = elements.length + 1;
            Object[] newArray = new Object[newSize];
            for (int i = 0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            newArray[newSize - 1] = element;
            elements = newArray;
        }

        for (int i = 0; i < elements.length; i++) {
            System.err.println((int) elements[i]);
        }
        System.err.println("---------------");

    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

}
