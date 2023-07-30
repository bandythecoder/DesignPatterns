package BehavioralPattern.StrategyPattern;

public class SuperManAttackingBehaviorImpl extends AttackingBehavior {
    @Override
    public void attack() {
        System.out.println("Not Attacking");
    }
}
