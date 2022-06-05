package homework.chapter9;

public class OverloadCons2 {

    public static void main(String[] args) {
        Box1 mybox1 = new Box1(10, 20, 30);
        Box1 mybox2 = new Box1(10, 20, 30);
        Box1 mycube = new Box1(7);

        Box1 myclone = new Box1(mybox1);
        double vol;
        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);

        //получить объем куба
        vol = mycube.volume();
        System.out.println("Oбъeм куба равен " + vol);

        // получить объем клона
        vol = myclone.volume();
        System.out.println("Oбъeм клона равен " + vol);
    }

}
