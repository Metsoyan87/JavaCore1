package homework.arrayUtil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 1, 9, 6};
        ArrayUtil au = new ArrayUtil();
        System.out.println("max = " + au.max(numbers));
        System.out.println("min = " + au.min(numbers));
        au.length(numbers);
        au.evenNumbers(numbers);
        au.oddEvenCount(numbers);
        au.average(numbers);
        au.repeatable(numbers,9);
        au.isIndexExists(numbers,21);
    }

}



