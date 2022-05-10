package homework.chapter5;

public class ByteShift {
    public static void main(String[] args) {
        //Сдвиг влево значения типа byte
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Пepвoнaчaльнoe значение а: " + a);
        System.out.println("i and b: " + i + " " + b);


    }
}
