package Structual.FACADE;

public class Demo
{

    public static void main(String[] string)
    {
        Car car = new CarImpl();
        car.start();
        car.playMusic();
        car.stop();
    }
}
