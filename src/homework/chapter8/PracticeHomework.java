package homework.chapter8;

public class PracticeHomework {

    long convert(int minutes) {
        long n = minutes * 60;
        return n;
    }

    int calcAge(int years) {
        int n = years * 365;
        return n;
    }

    int nextNumber(int number) {
        int n = number + 1;
        return n;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else {

        }
        return false;
    }

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean reverseBool(boolean value) {
        if (value == true) {
            return false;
        } else {
            return true;
        }
    }

    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array1.length;
        }else {
           return array2.length;
        }
    }

}
