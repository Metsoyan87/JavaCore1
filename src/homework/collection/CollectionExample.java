package homework.collection;

import java.util.*;
import java.util.Collections;

public class CollectionExample {

    public static void main(String[] args) {
        String[] numbers = new String[]{"1", "2", "3", "4", "5", "6"};
        System.out.println(arrayToList(numbers));
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");

        System.out.println(removeById(list, 4));

        listToSet(list);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        System.out.println();

        listToLinkedList(intList);

        System.out.println();

        System.out.println(reverseNumbers(intList));

        printFirstFive(list);
        System.out.println(sizeOfList(list));

    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        List<String> list = Arrays.asList(values);

        return list;
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ++++++
    // ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {
        list.remove(5);
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        Set<String> set = new HashSet<>(list);
        for (String x : set) {
            set.add(x);
        }
        for (String x : set)
            System.out.print(x + " ");
        return null;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        List<Integer> listInt = new LinkedList<>(list);
        for (Integer integer : listInt) {
            System.out.print(integer + " ");
        }
        return null;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ,
    // որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {
        Collections.reverse(list);

        //        for (int k = 0, j = list.size() - 1; k < j; k++) {    2-rord tarberak
        //            list.add(k, list.remove(j));
        //        }
        return list;
    }


    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        List<String> strings = list.subList(0, 5);
        System.out.println(strings);
    }


    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list) {
        int size = list.size();
        return size;
    }

}