import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meneger
{
    private List<Car> CarList = new ArrayList<Car>();

    public void AddCarToList(Car car)
    {
        CarList.add(car);
    }

    public Car GetCar(int i)
    {
        return CarList.get(i);
    }

    public ArrayList<Car> GetNewListCarOfDrwExpOverFiveYears()
    {
        ArrayList<Car> newCarList = new ArrayList<Car>();

        for (int i = 0; i < CarList.stream().count(); i++)
        {
            Car car = CarList.get(i);
            if (car.GetDriverCar().GetExperience() >= 5)
            {
                newCarList.add(car);
            }
        }
        return newCarList;
    }

    public ArrayList<Car> GetNewListCarOfSovietCars()
    {
        ArrayList<Car> newCarList = new ArrayList<Car>();
        String[] markOfCar = new String[]{Arrays.toString(Enums.MarkOfCar.values())};
        String[] newMarkOfCar = markOfCar[0].split(",");
        newMarkOfCar[0] = "Lada";
        newMarkOfCar[newMarkOfCar.length - 1] = "Moskvitch";
        for (int i = 0; i < CarList.stream().count(); i++)
        {
            Car car = CarList.get(i);
            if (car.GetNameCar() == newMarkOfCar[0] ||
                car.GetNameCar() == newMarkOfCar[1] ||
                car.GetNameCar() == newMarkOfCar[5] ||
                car.GetNameCar() == newMarkOfCar[6] ||
                car.GetNameCar() == newMarkOfCar[7] ||
                car.GetNameCar() == newMarkOfCar[8] ||
                car.GetNameCar() == newMarkOfCar[11])
            {
                newCarList.add(car);
            }
        }
        return newCarList;
    }
}
