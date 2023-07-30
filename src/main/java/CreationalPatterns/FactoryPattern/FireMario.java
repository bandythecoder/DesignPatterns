package CreationalPatterns.FactoryPattern;

public class FireMario extends Mario {

    @Override
    void jump() {
        System.out.println("Fire Mario Jump");

    }

    @Override
    void run() {
        System.out.println("Fire Mario run");
    }
}
