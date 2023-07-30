package CreationalPatterns.AbstractFactory;

public class TechFeeCalculator extends FeeCalculator {

    @Override
    int calculateFee() {
        return 10000;
    }
}
