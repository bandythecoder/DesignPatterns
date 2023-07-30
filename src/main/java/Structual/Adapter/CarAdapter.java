package Structual.Adapter;

public class CarAdapter implements Vehicle{

    Truck truck;

    public CarAdapter(Truck truck) {
        this.truck = truck;
    }

    @Override
    public String getName() {
        return truck.getName();
    }

    @Override
    public double getWeight() {
        return truck.getWeight();
    }

    @Override
    public String getSize() {
        return truck.getSize();
    }
}
