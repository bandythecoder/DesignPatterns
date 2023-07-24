package FACADE;

public class EngineImpl implements Engine {

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }

    @Override
    public void start() {
        System.out.println("start the car");
    }
}
