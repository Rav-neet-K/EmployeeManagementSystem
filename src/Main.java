public class Main {
    public static void main(String[] args) {
        Employee[] emp =new Employee[5];
        emp[0]=new FullTimeEmployee(1,"Max",3000,20);
        emp[1]=new PartTimeEmployee(2,"Alex",30,100);
        emp[2]=new FullTimeEmployee(3,"Marsha",2500,20);
        emp[3]=new PartTimeEmployee(4,"Parsh",25,100);
        emp[4]=new PartTimeEmployee(5,"Vinea",15,100);




        for(Employee employee: emp){

            System.out.println(employee);
            System.out.println(employee.calculateBonus());

        }


    }
}