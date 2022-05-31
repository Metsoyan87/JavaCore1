package homework.arrayUtil;

public class ArrayUtil {

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    void length(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" length " + array.length);
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    void evenNumbers(int[] array) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0)
                System.out.print(array[j] + " ");
        }
        System.out.println();
    }

    void oddEvenCount(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                x++;
        }
        System.out.println("zuygeri tivy = " + x);
        System.out.println("kenteri tivy = " + (array.length - x));
    }

    void average(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println(result / array.length);
    }

    void repeatable(int[] array, int n) {
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                b = true;
            }
        }
        System.out.println(b + " " + n);
    }

    void isIndexExists(int[] array, int m) {
        for (int i = 0; i < array.length; i++) {
            if (m == array[i]) {
                m = i;
                System.out.println("krknum e " + m);
            }
        }
        System.out.println("aydpisi tiv chka ");
    }
}
