package employee;

public class Employee {
    private int id;
    private String name;
    private Double salary;
    private Double basicSalary;
    private Double hra;
    private Double da;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", basicSalary=" + basicSalary +
                ", hra=" + hra +
                ", da=" + da +
                '}';
    }

    Employee(int _id, String _name, Double _basicSalary){
        this.id = _id;
        this.name = _name;
        this.basicSalary = _basicSalary;
        this.hra = (15/100.0)*_basicSalary;
        this.da = (10/100.0)*_basicSalary;
        this.salary = this.basicSalary + this.hra + this.da;
    }
}
