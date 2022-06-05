package homework;

public class CharStack {
    private char[] array = new char[10];
    private int size;

    public CharStack() {
        size = -1;
    }

    void push(char value) {
        if (size == array.length) {
            System.out.println("stack-ը վերջացավ");
        } else {
            array[size + 1] = value;
        }
        size++;
    }

    char pop() {
        if (size < 0) {
            return 0;
        } else {
            return array[size--];
        }
    }

    char[] getArray() {
        return array;
    }

    public void setArray(char[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }
}

