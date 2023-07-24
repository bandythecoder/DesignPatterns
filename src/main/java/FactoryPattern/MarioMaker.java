package FactoryPattern;

public class MarioMaker extends AbstractMarioMaker {

    @Override
    Mario createMario(String type) {
        switch (type) {
            case "Super":
                return new SuperMario();
            case "Fire":
                return new FireMario();
            default:
                return new NoMarioMaker();
        }


    }


}
