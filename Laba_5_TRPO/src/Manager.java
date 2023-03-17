import java.util.ArrayList;
import java.util.List;

public class Manager
{
    private List<Car> carList = new ArrayList<Car>(); // исправлено название коллекции

    public void addCarToList(Car car)
    {
        carList.add(car);
    } // иправлено название метода

    public Car getCar(int i)
    {
        return carList.get(i);
    } // иправлено название метода

    public List<Car> getNewListCarOfDrwExpOverFiveYears() // иправлено название метода
    {
        List<Car> newCarList = new ArrayList<Car>();

        for (int i = 0; i < carList.stream().count(); i++)
        {
            Car car = carList.get(i);
            if (car.getDriverCar().getExperience() >= 5)

                newCarList.add(car);

        }
        return newCarList;
    }

    public List<Car> getNewListCarOfSovietCars() // иправлено название метода
    {
        List<Car> newCarList = new ArrayList<Car>();
        List<String> typeOfSovietCars  = List.of("Lada", "GAZ","MAZ","KAMAZ","KRAZ","Volga","Moskvitch");

        for (int i = 0; i < carList.stream().count(); i++)
        {
            Car car = carList.get(i);
            for (int k = 0; k < typeOfSovietCars.size(); k++)
            {
                if (car.getTypeOfCar() == typeOfSovietCars.get(k))
                    newCarList.add(car);
            }
        }
        return newCarList;
    }
}
