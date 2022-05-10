package classwork;

public class ArrayExample {
    public static void main(String[] args) {
        // massiv in numbers

        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            int x = i + 1;
            numbers[i] = x;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
