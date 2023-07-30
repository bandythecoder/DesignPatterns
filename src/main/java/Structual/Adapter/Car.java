package Structual.Adapter;

public class Car implements Vehicle {

    @Override
    public String getName() {
        return "Car";
    }

    @Override
    public double getWeight() {
        return 200;
    }

    @Override
    public String getSize() {
        return "mid";
    }
}
