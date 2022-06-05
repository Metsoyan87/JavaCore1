package homework.chapter9;

public class PassOb {

    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1==оb2: " + ob1.equalTo(ob2));
        System.out.println("ob1==оb3: " + ob1.equalTo(ob3));

    }

}
