public class FullTimeEmployee extends Employee{
   private int annualLeaveDays ;


    public FullTimeEmployee(int id, String name, double salary, int annualLeaveDays) {
        super(id, name, salary);
        this.annualLeaveDays = annualLeaveDays;
    }



    public int getAnnualLeaveDays() {
        return annualLeaveDays;
    }

    public void setAnnualLeaveDays(int annualLeaveDays) {
        this.annualLeaveDays = annualLeaveDays;
    }

    @Override
    public double calculateBonus() {

        double s =getSalary();

        double bonus= s*0.1;


        return super.calculateBonus()+bonus;
    }


    @Override
    public String toString() {
        return "FullTimeEmployee{"  +
        "id=" + getId()+
                ", name='" + getName() +
                ", salary=" + getSalary()+
                "annualLeaveDays=" + annualLeaveDays +
                '}';
    }
}
