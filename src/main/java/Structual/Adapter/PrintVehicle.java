package Structual.Adapter;

public class PrintVehicle {

    private static Vehicle vehicle;

    public PrintVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public static void print()
    {
        System.out.println(vehicle.getName() + " is a " + vehicle.getSize() + " vehicle of " + vehicle.getWeight() + " Kg");
    }
}
