package homework.chapter6;

public class BreakLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i == 10) // выйти из цикла, если значение
                break;  //переменной i равно 10
            System.out.println("i: " + i);
        }

        System.out.println("Цикл завершен.");

    }
}
