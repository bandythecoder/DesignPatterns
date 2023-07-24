package FACADE;

public class CarImpl implements Car {
    MusicPlayer musicPlayer;
    Steering steering;
    Engine engine;

    public CarImpl() {
        this.musicPlayer = new MusicPlayerImpl();
        this.steering = new SteeringImpl();
        this.engine = new EngineImpl();
    }

    @Override
    public void start() {
        engine.start();
    }

    @Override
    public void stop() {
       engine.stop();
    }

    @Override
    public void playMusic() {
        musicPlayer.playMessage();
    }

    @Override
    public void stopMusic() {
       musicPlayer.stopMessage();
    }

    @Override
    public void turnLeft() {
       steering.turnLeft();
    }

    @Override
    public void turnRight() {
        steering.turnRight();
    }
}
