package employee;

public class TestEmployee {
    public static Double BASIC_SALARY = 60000.0;
    public static void main(String args[]){
        Employee e1 = new Employee(1,"Vyankatesh",35000.0);
        EmployeeV2 e2 = new EmployeeV2();
        e2.setId(2);
        e2.setBasicSalary(BASIC_SALARY);
        e2.setName("Omkar");
        e2.setHra((15.0/100)*BASIC_SALARY);
        e2.setDa((10.0/100)*BASIC_SALARY);
        e2.setSalary(e2.getBasicSalary()+e2.getDa()+e2.getHra());
        System.out.println("Employee E1");
        System.out.println(e1);
        System.out.println("Employee E2");
        System.out.println(e2);

    }
}
