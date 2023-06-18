package SRP;

public class CalculateNetSalary {

    private int taxRate; 

    /**
     * @param taxRate
     * Constructor  for calculate net salary
     */
    public CalculateNetSalary(int taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * @param employee
     * @return - net salary for employee
     */
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25);// calculate in otherway
        return tax;
    }


    /**
     * @return getter and setter for taxRate
     */
    public int getTaxRate() {
        return taxRate;
    }
    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

}
