package Structual.Adapter;

public class Demo
{
    public static void main(String[] args)
    {
        Truck car = new Truck();
        PrintVehicle print = new PrintVehicle(new CarAdapter(car));
        PrintVehicle.print();

    }
}
