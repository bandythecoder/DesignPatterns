package AbstractFactoryPattern;

public class ArtFeeCalculator extends FeeCalculator {

    @Override
    int calculateFee() {
        return 4000;
    }
}
