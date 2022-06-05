package homework.chapter9;

public class CallByValue {

    public static void main(String[] args) {

        Test1 ob = new Test1(15,20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }

}
