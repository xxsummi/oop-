/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version2;

/**
 *
 * @author User
 */
public class CommisionEmployee extends Employee{
    private double totalSales;

    public CommisionEmployee() {
    }

    public CommisionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }

    public CommisionEmployee(Employee e) {
        super(e.getEmpName(), e.getEmpID());
    }

    public CommisionEmployee(String empName, int empID){
        super(empName, empID);    
    }
    
    public CommisionEmployee(Employee e, double totalSales) {
        super(e.getEmpName(), e.getEmpID());
        this.totalSales = totalSales;
    }
    
    public CommisionEmployee(double totalSales, Employee e) {
        super(e.getEmpName(), e.getEmpID());
        this.totalSales = totalSales;
    }
    
    public CommisionEmployee(double totalSales, String empName, int empID) {
        super(empName, empID);
        this.totalSales = totalSales;
    }
    
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
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
    
    public void displayCommisionEmployee(){
         System.out.println(toString()  + computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommisionEmployee{");
        sb.append("totalSales=").append(totalSales);
        sb.append('}');
        return sb.toString();
    }
    
}
