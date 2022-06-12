package homework.braceCheckerSwitch;

public class CharStack {

    private char[] array = new char[10];
    private int size;

    CharStack() {
        size = -1;
    }

    void push(char value) {
        if (size == array.length) {
            System.out.println("stack is a full");
        } else {
            array[++size] = value;
        }
    }

    char pop() {
        if (size < 0) {
            return 0;
        } else {
            return array[size--];
        }

    }
}





