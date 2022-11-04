public class Workers extends Person{
    String Password;
    double Salary;
    int ID;
    int WorkingHours;

    public Workers() {
    }

    public Workers(String name, int ID, String password, double salary, int ID1, int workingHours) {
        super(name, ID);
        Password = password;
        Salary = salary;
        this.ID = ID1;
        WorkingHours = workingHours;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(int workingHours) {
        WorkingHours = workingHours;
    }
}
