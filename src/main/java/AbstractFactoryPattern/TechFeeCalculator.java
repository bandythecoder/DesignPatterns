package AbstractFactoryPattern;

public class TechFeeCalculator extends FeeCalculator {

    @Override
    int calculateFee() {
        return 10000;
    }
}
