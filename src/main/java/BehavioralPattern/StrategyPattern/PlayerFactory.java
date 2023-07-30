package BehavioralPattern.StrategyPattern;

public class PlayerFactory {
    public static Player createPlayer(String input)
    {
        if(input.equals("Super"))
        {
            return new SuperMan(new SuperManAttackingBehaviorImpl(), new SuperManJumpingBehaviourImpl(), new SuperManFlyingBehavior());
        }
        return null;
    }
}
