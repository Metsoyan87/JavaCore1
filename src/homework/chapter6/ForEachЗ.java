package homework.chapter6;

public class ForEachЗ {
    public static void main(String[] args) {
        //Применение цикла for в стиле for each для
        //обращения к двухмерному массиву

        int sum = 0;
        int nums[][] = new int[3][5];
        // присвоить значение элементам массива nums
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);
        // использовать цикл for в стиле for each для
        // вывода и суммирования значений
        for (int х[] : nums) {
            for (int у : х) {
                System.out.println("Знaчeниe равно: " + у);
                sum += у;

            }
        }
        System.out.println("Cyммa: " + sum);
    }
}
