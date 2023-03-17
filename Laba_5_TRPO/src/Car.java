public class Car
{
    private String nameCar; // изменено название переменной
    private String typeOfCar; // изменено название переменной
    private Driver driverCar; // изменено название переменной
    private Engine engineOfCar; // изменено название переменной
    private double weightOfCar; // изменено название переменной

    public  Car(String nameCar, String typeOfCar, Driver driverCar, Engine engineOfCar, double weightOfCar)
    {
        this.nameCar = nameCar;
        this.typeOfCar = typeOfCar;
        this.driverCar = driverCar;
        this.engineOfCar = engineOfCar;
        this.weightOfCar = weightOfCar;
    }

    public Driver getDriverCar()
    {
        return driverCar;
    } // изменено название метода

    public Engine getEngenOfCar()
    {
        return engineOfCar;
    } // изменено название метода

    public String getNameCar()
    {
        return nameCar;
    } // изменено название метода

    public String getTypeOfCar()
    {
        return typeOfCar;
    } // изменено название метода

    public double getWeightOfCar()
    {
        return weightOfCar;
    } // изменено название метода
}
