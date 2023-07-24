package AbstractFactoryPattern;

public class TechUniversity extends UniversityFactory {

    @Override
    AdmitCard getAdmitCard() {
        return new TechAdmitCard();
    }

    @Override
    FeeCalculator getFeeCalculator() {
        return new TechFeeCalculator();
    }
}
