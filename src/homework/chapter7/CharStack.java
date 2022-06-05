package homework.chapter7;

public class CharStack {
    int stck[] = new int[10];
    int tos;

    CharStack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Cтeк заполнен.");
        } else {
            stck[++tos] = item;
        }
    }


    int рор() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
