package Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String NINumber, double salary, String deptName) {
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDept(){
        return this.deptName;
    }
}
