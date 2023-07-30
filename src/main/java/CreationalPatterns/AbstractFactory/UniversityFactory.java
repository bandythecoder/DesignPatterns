package CreationalPatterns.AbstractFactory;

public abstract class UniversityFactory
{

    public static UniversityFactory getFactory(double marks)
    {
        if(marks > 65)
        {
            return new TechUniversity();
        }
        else
        {
            return new ArtUniversity();
        }
    }
    abstract AdmitCard getAdmitCard();
    abstract FeeCalculator getFeeCalculator();
}
