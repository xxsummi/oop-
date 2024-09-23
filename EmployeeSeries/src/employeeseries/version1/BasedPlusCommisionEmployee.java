/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version1;

/**
 *
 * @author User
 */
public class BasedPlusCommisionEmployee {
    // -totalSales:double
    // -baseSalary:double
    // -empName:String
    // -empID:int
    // +computeSalary():double
    //  -> less than  10,000 - 5% sales
    //  -> less than 100,000 but greater than or eal to 10k - 10 % sales
    //  -> less than 1M - 20% sales
    //  -> above and equal to 1 M - 30% sales
    //  ->commision + base salry
    // +displayHourlyEmployee():void
    //  -> Employee ID: xxx
    //     Employee Name: xxx
    // +toString():String
    //  -> similar with display
    
    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empID;

    public BasedPlusCommisionEmployee() {
    }

    public BasedPlusCommisionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public BasedPlusCommisionEmployee(double totalSales, double baseSalary, String empName, int empID) {
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double computeSalary(){
        double sal = baseSalary;
        if(totalSales < 10000){
            sal+=10000*.05;
        } else if(totalSales>=1000 && totalSales<100000){
            sal+=totalSales*0.10;
        } else if(totalSales>=100000 && totalSales<1000000){
            sal+=totalSales*0.20;
        } else if(totalSales>=1000000){
            sal+=totalSales*0.30;
        }
        
        return sal;
    }
    
    void displayBasedPlusCommisionEmployee(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nEmployee ID: " + empID + "\nEmployee Name: " + empName + "\nTotal Sales: " + totalSales + "\nBase Salary: " + baseSalary + "\nTotal Salary: " + computeSalary();
    }

}
