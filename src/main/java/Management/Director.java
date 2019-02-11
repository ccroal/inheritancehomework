package Management;
import Management.Manager;

public class Director extends Manager {
    private double budget;

    public Director(String name, String NINumber, double salary, String deptName,  double budget) {
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        double bonus = (getSalary()/100) * 2;
        return bonus;
    }
}
