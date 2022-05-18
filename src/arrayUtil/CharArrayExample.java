package arrayUtil;

public class CharArrayExample {
    public static void main(String[] args) {
        //1.Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int n = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                n++;
                System.out.println("c-փոփոխականից կա " + n + " հատ ");
            }
        }

        //2.պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        for (int i = 3; i < chars2.length - 3; i++) {
            System.out.print(chars2[i] + " ");
        }


        //3.պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        if (chars3[6] == 'l' && chars3[7] == 'y') {
            System.out.println(true);

        } else System.out.println(false);


        //4.Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a' };
        for (int i = 0; i < bobArray.length; i++) {
            char a = 'b';
            char s = 'o';
            char d = 'b';
            if (bobArray[i] == a || bobArray[i] == s || bobArray[i] == d) {
                System.out.println(true);
                break;
            }
            System.out.println(false);
        }


        //5.պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}


