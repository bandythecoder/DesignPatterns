package BehavioralPattern.StrategyPattern;

public abstract class Player
{
    AttackingBehavior attackingBehavior;
    FlyingBehavior flyingBehavior;
    JumpingBehaviour jumpingBehaviour;

    public void attack()
    {
        attackingBehavior.attack();
    }

    public void jump()
    {
        jumpingBehaviour.jump();
    }

    public void fly()
    {
        flyingBehavior.fly();
    }

}

