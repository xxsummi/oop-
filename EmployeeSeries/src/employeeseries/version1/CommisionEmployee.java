/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version1;

/**
 *
 * @author User
 */
public class CommisionEmployee {
    private double totalSales;
    private String empName;
    private int empID;
    
    public CommisionEmployee(){
    }

    public CommisionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    
    public CommisionEmployee(double totalSales, String empName, int empID) {
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
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
        double salary=0;
        if(totalSales < 1000){
            salary=10000*.05;
        } else if(totalSales>=1000 && totalSales<100000){
            salary=totalSales*0.10;
        } else if(totalSales>=100000 && totalSales<1000000){
            salary=totalSales*0.20;
        } else if(totalSales>=1000000){
            salary=totalSales*0.30;
        }
        return salary;
    }
    
    void displayCommisionEmployee(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "\nEmployee ID: " + empID + "\nEmployee Name: " + empName + "\nTotal Sales: " + totalSales + "\nTotal Salary: " + computeSalary();
    }
}
