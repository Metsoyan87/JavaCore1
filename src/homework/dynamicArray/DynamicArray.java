package homework.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    //++++
    // Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր
    // dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ. Եթե ունենք՝ false
    boolean isEmpty() {
        if (size > 0) {
            return false;
        }
        return true;
    }

    // ++++
    //Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս,
    // և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը,
    // եթե չկա թող վերադարձնի 0;
    public int getByIndex(int index) {
        int value = -1;
        if (index < array.length) {
            value = array[index];
            return value;
        }
        return 0;
    }

    //++++
    //Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value,
    // և եթե մեր մասիվի մեջ ունենք այդ թվից, կվերադարձնի իր ինդեքսը. եթե շատ ունենք,
    // պետք է վերադարձնել առաջինի ինդեքսը
    int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                value = array[i];
                return i;
            }
        }
        return 0;
    }

    //++++
    //Գրել մեթոդ set անունով, որը կընդունի int index, int value
    // և վալյուն կդնի տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).
    void set(int index, int value) {
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                array[i] = value;
            }
        }
    }

    //++++
    //Գրել մեթոդ add(int index, int value) որը տրված
    // վելյուն կդնի տրված ինդեքսի տեղը, իսկ էղած
    // թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի
    void add(int index, int value) {
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                array[i + 1] = array[i];
                array[i] = value;
            }
        }
    }
    //++++
    // Գրել մեթոդ delete(int index) որ տանք ինդեքսը,
    // այդ ինդեքսի տակ գտնվող թիվը հեռացնի մասիվից.
    // (նոր մասիվ պետք չէ սարքել)

    void delete(int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
}



