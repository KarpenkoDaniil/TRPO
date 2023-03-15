public class Driver
{
    public  Driver(String name, String surname, String midlename, int drivingExpereince)
    {
        Name = name;
        Surname = surname;
        Midlename = midlename;
        DrivingExpereince = drivingExpereince;
    }

    private  int DrivingExpereince;
    private String Name;
    private String Surname;
    private String Midlename;

    public String[] GetFIO() {
        String FIO[] = new String[3];
        int i;
        FIO[0] = Name;
        FIO[1] = Surname;
        FIO[2] = Midlename;
        return FIO;
    }

    public  int GetExperience()
    {
        return DrivingExpereince;
    }
}
