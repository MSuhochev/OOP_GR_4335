package SRP;

import java.sql.Date;

public class Employee {
    private String name; //param Name
    private Date dob;    //param Date of birthday
    private int baseSalary;

    //Constructor for Employee class
    /**
     * @param name - Employee name
     * @param dob  - Employee date of birthday
     * @param baseSalary - Emploee base salary
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    //Getters for Employee class
    /**
     * @return - Name, Date of Birthday and Base Salary
     */
    public String getName() {
        return name;
    }
    public Date getDob() {
        return dob;
    }
    public int getBaseSalary() {
        return baseSalary;
    }

    /**
     * @return - info about employee
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}