package homework;

public class Tnayin {
    public static void main(String[] args) {

        int array[] = {12, 88, 7, 81, 56, 73, 1, 5};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        System.out.println(count/ array.length);
    }
}
