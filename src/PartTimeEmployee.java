public class PartTimeEmployee extends Employee{

    private int hoursWorked;

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public PartTimeEmployee(int id, String name, double salary, int hoursWorked) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateBonus() {

        return (getSalary()*0.5)/hoursWorked;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "id=" + getId()+
                ", name='" + getName() +
                ", salary=" + getSalary()+"hoursWorked=" + hoursWorked +
                '}';
    }
}
