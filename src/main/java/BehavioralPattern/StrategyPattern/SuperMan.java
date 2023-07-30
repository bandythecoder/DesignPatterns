package BehavioralPattern.StrategyPattern;

public class SuperMan extends Player
{
    public SuperMan(AttackingBehavior attackingBehavior, JumpingBehaviour jumpingBehaviour, FlyingBehavior fly)
    {
        this.attackingBehavior = attackingBehavior;
        this.flyingBehavior = fly;
        this.jumpingBehaviour = jumpingBehaviour;
    }
}
