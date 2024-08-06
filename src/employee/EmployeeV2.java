package employee;

public class EmployeeV2 {
    private int id;
    private String name;
    private Double salary;
    private Double basicSalary;
    private Double hra;
    private Double da;

    @Override
    public String toString() {
        return "EmployeeV2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", basicSalary=" + basicSalary +
                ", hra=" + hra +
                ", da=" + da +
                '}';
    }

    public int getId(){
        return this.id;
    }
    public void setId(int _id){
        this.id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getHra() {
        return hra;
    }

    public void setHra(Double hra) {
        this.hra = hra;
    }

    public Double getDa() {
        return da;
    }

    public void setDa(Double da) {
        this.da = da;
    }
}
