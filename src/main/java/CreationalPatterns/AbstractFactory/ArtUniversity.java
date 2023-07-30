package CreationalPatterns.AbstractFactory;

public class ArtUniversity extends UniversityFactory {

    @Override
    AdmitCard getAdmitCard() {
        return new ArtAdmitCard();
    }

    @Override
    FeeCalculator getFeeCalculator() {
        return new ArtFeeCalculator();
    }
}

