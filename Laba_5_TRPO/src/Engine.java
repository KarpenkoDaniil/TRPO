public class Engine // исправленно название класса
{
    String typeOfEngen; // изменено название переменной
    private double powerOfEngen; // изменено название переменной

    public Engine(String typeOfEngen, double powerOfEngen)
    {
        this.powerOfEngen = powerOfEngen;
        this.typeOfEngen =typeOfEngen;
    }

    public double getPowerOfEngine() // изменено название метода
    {
        return powerOfEngen;
    }

    public String getTypeOfEngine() // изменено название метода
    {
        return typeOfEngen;
    }
}
