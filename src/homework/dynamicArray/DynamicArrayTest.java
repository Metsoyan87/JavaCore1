package homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(12);
        dynamicArray.add(13);
        dynamicArray.add(14);
        dynamicArray.add(15);
        dynamicArray.add(16);
        dynamicArray.add(17);
        dynamicArray.add(18);
        dynamicArray.add(19);
        dynamicArray.add(20);
        dynamicArray.add(21);
        dynamicArray.add(22);
        dynamicArray.add(23);
        dynamicArray.add(24);
        dynamicArray.add(25);
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.getByIndex(6));
        System.out.println(dynamicArray.getFirstIndexByValue(3));
        dynamicArray.set(1,22);
        dynamicArray.printArray();
        dynamicArray.add(1,2);
        System.out.println();
        dynamicArray.printArray();
        dynamicArray.delete(2);
        System.out.println();
        dynamicArray.printArray();
    }
}
