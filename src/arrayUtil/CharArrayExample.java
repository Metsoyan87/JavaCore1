package arrayUtil;

public class CharArrayExample {
    public static void main(String[] args) {
        //1.Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e', 'o'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("c-փոփոխականից կա " + count + " հատ ");

        //2.պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int middleIndex = chars2.length / 2;
        System.out.println(chars2[middleIndex]);
        System.out.println(chars2[middleIndex - 1]);


        //        int x = (chars2.length) / 2 - 1;
        //        System.out.print(chars2[x]);
        //        System.out.print(chars2[x + 1]);
        //        System.out.println();

        //3.պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        char x = chars3[chars.length - 2];
        char y = chars3[chars.length - 1];
        boolean result = false;
        if (x == 'l' && y == 'y') {
            result = true;
        }
        System.out.println(result);

//        int i = chars3.length - 1;
//        boolean b = false;
//        if (chars3[i] == 'y' && chars3[i - 1] == 'l') {
//            b = true;
//        }
//        System.out.println(b);

        //4.Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։

        char[] bobArray = {'b', 'h', 'b', 'i', 'n', 'o'};
        boolean bobResult = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobResult = true;
                break;
            }
        }
        System.out.println("bobResult" + bobResult);


//        boolean isBob = false;
//        for (int j = 0; j < bobArray.length - 2; j++) {
//            if (bobArray[j] == 'b' && bobArray[j + 2] == 'b') {
//                isBob = true;
//                break;
//            }
//        }
//        System.out.println(isBob);

        //5.պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (char c1 : text) {
            if (c1 != ' ') {
                System.out.print(c1);
            }
        }

        //        for (int j = 0; j < text.length; j++) {
        //            if (text[j] != ' ') {
        //                System.out.print(text[j]);
    }
}





