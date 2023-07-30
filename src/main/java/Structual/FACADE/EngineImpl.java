package Structual.FACADE;

import java.util.Arrays;

public class EngineImpl implements Engine {

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }

    @Override
    public void start() {
        Arrays.asList(new int[]{1,2,3});
        System.out.println("start the car");
    }
}
