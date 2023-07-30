package CreationalPatterns.FactoryPattern;

public class GameManager
{
    AbstractMarioMaker marioMaker;
    Mario player = null;
    public GameManager(AbstractMarioMaker marioMaker)
    {
        this.marioMaker = marioMaker;
    }
    public void startGame(String type)
    {
       player = marioMaker.createMario(type);
    }

    public void performRun()
    {
        player.run();
    }

    public void performJump()
    {
        player.jump();
    }
}

