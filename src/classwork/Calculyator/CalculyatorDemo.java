package classwork.Calculyator;

public class CalculyatorDemo {

    public static void main(String[] args) {

        Calculyator calculyator = new Calculyator();
        double c = calculyator.plus(1,1);
        System.out.println(c);
        double v = calculyator.divine(2,2);
        System.out.println(v);
        double n = calculyator.minus(14,5);
        System.out.println(n);
        double m = calculyator.multiple(10,10);
        System.out.println(m);


    }

}
