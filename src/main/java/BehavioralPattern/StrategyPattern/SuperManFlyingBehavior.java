package BehavioralPattern.StrategyPattern;

public class SuperManFlyingBehavior extends FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("flying very High");
    }
}
