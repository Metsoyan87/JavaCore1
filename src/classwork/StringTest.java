package classwork;

public class StringTest {

    public static void main(String[] args) {
        String name = "Poxos Poxosyan";
        char[] chars = name.toCharArray();
        String reso = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                reso += chars[i];
            } else {
                reso += chars[i];
            }
        }
        System.out.println(reso);
    }
}
