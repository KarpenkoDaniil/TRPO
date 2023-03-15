public class Car
{
    private String NameCar;
    private String TypeOfCar;
    private Driver DriverCar;
    private Engen EngenOfCar;
    private double WeightOfCar;

    public  Car(String nameCar, String typeOfCar, Driver driverCar, Engen engenOfCar, double weightOfCar)
    {
        NameCar = nameCar;
        TypeOfCar = typeOfCar;
        DriverCar = driverCar;
        EngenOfCar = engenOfCar;
        WeightOfCar = weightOfCar;
    }

    public Driver GetDriverCar()
    {
        return DriverCar;
    }

    public Engen GetEngenOfCar()
    {
        return EngenOfCar;
    }

    public String GetNameCar()
    {
        return NameCar;
    }

    public String GetTypeOfCar()
    {
        return TypeOfCar;
    }

    public double GetWeightOfCar()
    {
        return WeightOfCar;
    }
}
