package homework.chapter9;

public class OverloadDemo {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");

    }

    // Перегружаемый метод, проверяющий наличие
         // одного целочисленного параметра
    void test(int а) {
        System.out.println("a: " + а);
        // Перегружаемый метод, проверяющий наличие
        // двух целочисленных параметров
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    double test(double а) {
        System.out.println("double а: " + а);
        return а * а;
    }
}
