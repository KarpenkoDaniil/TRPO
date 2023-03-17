import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean exit = true;
        Manager meneger = new Manager();
        while (exit)
        {
            int i = 1;
            System.out.println("1. Input car");
            System.out.println("2. Show driver which has over them five year's of driver expereince");
            System.out.println("3. Show soviet car's");
            System.out.println("4. Shutdown\n");
            System.out.println("Input punct");
            i = in.nextInt();
            switch (i)
            {
                case 1:
                    String[] markOfCar = new String[]{Arrays.toString(Enums.MarkOfCar.values())};
                    String[] newMarkOfCar = markOfCar[0].split(",");
                    newMarkOfCar[0] = "Lada";
                    newMarkOfCar[newMarkOfCar.length - 1] = "Moskvitch";
                    for (int t = 0; t < newMarkOfCar.length; t++)
                    {
                        System.out.println((t + 1) + " " + newMarkOfCar[t]);
                    }
                    System.out.println("Chose mark of car");
                    int type = in.nextInt();

                    System.out.println("Input type of car");
                    String[] newTypes = {"Pasanger","Truck"};
                    for (int t = 0; t < newTypes.length; t++)
                    {
                        System.out.println((t+1) + " " + newTypes[t]);
                    }
                    int typeOfCar = in.nextInt();

                    System.out.println("Input weight of car");
                    double weightOfCar = in.nextDouble();


                    System.out.println("Input your name");
                    String name = in.next();

                    System.out.println("Input your surname");
                    String surname = in.next();

                    System.out.println("Input your midlename");
                    String midlename = in.next();

                    System.out.println("Input your experience");
                    int sizeOfExp = in.nextInt();


                    System.out.println("Input name of engen");
                    String nameOfEngen = in.next();

                    System.out.println("Input power of engen");
                    double powerOfEngen = in.nextDouble();

                    Engine newEngine = new Engine(nameOfEngen,powerOfEngen);
                    Driver newDriver = new Driver(name,surname,midlename,sizeOfExp);
                    Car newCar = new Car(newMarkOfCar[type - 1], newTypes[typeOfCar], newDriver, newEngine, weightOfCar);

                    meneger.addCarToList(newCar);
                    break;
                case 2:
                    List<Car> DriverOverThemFiveYersDriverExperience = meneger.getNewListCarOfDrwExpOverFiveYears();
                    for (int t = 0; t < DriverOverThemFiveYersDriverExperience.size(); t++)
                    {
                        Car nowDriver = DriverOverThemFiveYersDriverExperience.get(t);
                        String[] Driver = nowDriver.getDriverCar().getFIO();
                        System.out.println(Driver[0] + " " + Driver[1] + " " + Driver[2] + "\n" + "Experience " + nowDriver.getDriverCar().getExperience());
                    }
                    break;
                case 3:
                    List<Car> SovietsCar = meneger.getNewListCarOfSovietCars();
                    for (int t = 0; t < SovietsCar.size(); t++)
                    {
                        Car nowCar = SovietsCar.get(t);
                        System.out.println(nowCar.getNameCar() + "\n" + nowCar.getTypeOfCar() + "\n" + nowCar.getEngenOfCar().getTypeOfEngine() + "power = " +
                                nowCar.getEngenOfCar().getPowerOfEngine()
                                + "\n" + nowCar.getWeightOfCar());
                    }
                    break;
                case 4:
                    exit = false;
                    break;
            }
        }
    }
}