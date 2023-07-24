package FACADE;

public class MusicPlayerImpl implements MusicPlayer {
    @Override
    public void playMessage() {
     System.out.println("Play Music");
    }

    @Override
    public void stopMessage() {
        System.out.println("stop Music");
    }
}
