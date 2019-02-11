package Staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if (name != null) {
            this.name = name;
        }
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        if (raise < 0){
            raise = 0;
        }
        this.salary += raise;
    }

    public double payBonus(){
        double bonus = this.salary/100;
        return bonus;
    }
}
