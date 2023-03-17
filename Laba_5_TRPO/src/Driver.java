public class Driver
{
    public  Driver(String name, String surname, String midlename, int drivingExpereince)
    {
        this.name = name;
        this.surname = surname;
        this.midlename = midlename;
        this.drivingExpereince = drivingExpereince;
    }

    private  int drivingExpereince; // изменено название переменной
    private String name; // изменено название переменной
    private String surname; // изменено название переменной
    private String midlename; // изменено название переменной

    public String[] getFIO() // изменено название метода
    {
        String FIO[] = new String[3];
        int i;
        FIO[0] = this.name;
        FIO[1] = this.surname;
        FIO[2] = this.midlename;
        return FIO;
    }

    public  int getExperience() // изменено название метода
    {
        return drivingExpereince;
    }
}
