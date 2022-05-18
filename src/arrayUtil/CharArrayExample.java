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
            }
        }
        System.out.println("c-փոփոխականից կա " + n + " հատ ");
        //2.պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        int x = (chars2.length-1) / 2;
        System.out.print(chars2[x] );
        System.out.print(chars2[x + 1]);
        System.out.println();
        //3.պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        int i = chars3.length - 1;
        boolean b = false;
        if (chars3[i] == 'y' && chars3[i - 1] == 'l') {
            b = true;
        }
        System.out.println(b);
        //4.Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a' };
        boolean isBob = false;
        char bob = 'b';
        for (int i1 = 0; i1 < bobArray.length; i++) {
            if (i1 + 2 < bobArray.length && bobArray[i1] == bob && bobArray[i1 + 2] == bob) {
                isBob = true;
                break;
            }
        }
        System.out.println(isBob);

        //5.պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int j = 0; j < text.length; j++) {
            if (text[j] != ' ') {
                System.out.print(text[j]);
            }
        }
    }
}
