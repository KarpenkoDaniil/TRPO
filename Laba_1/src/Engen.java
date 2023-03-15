public class Engen
{
    String TypeOfEngen;
    private double PowerOfEngen;

    public Engen(String typeOfEngen, double powerOfEngen)
    {
        PowerOfEngen = powerOfEngen;
        TypeOfEngen =typeOfEngen;
    }

    public double GetPowerOfEngen()
    {
        return PowerOfEngen;
    }

    public String GetTypeOfEngen()
    {
        return TypeOfEngen;
    }
}
