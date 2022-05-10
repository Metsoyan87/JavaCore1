package homework.chapter3;

public class Light {
    public static void main(String[] args) {
        //Вычислить расстояние, проходимое светом,
        //используя переменные типа long

        int lightspeed;
        int days;
        int seconds;
        int distance;

        lightspeed = 186000;
        days = 1000;

        seconds = days * 24 * 60 * 60;
        // преобразовать в секунды
        distance = lightspeed * seconds;
        // вычислить расстояние
        System.out.print("Зa " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + "миль.");


    }
}
