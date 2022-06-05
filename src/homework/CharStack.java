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
            array[++size] = value;
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
}

