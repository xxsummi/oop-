/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version2;

/**
 *
 * @author User
 */
public class BasedPlusCommisionEmployee extends CommisionEmployee{
    private double baseSalary;

    public BasedPlusCommisionEmployee() {
    }
    
    public BasedPlusCommisionEmployee(Employee e){
        super(e.getEmpName(), e.getEmpID());
    }
    
    public BasedPlusCommisionEmployee(double totalSales, Employee e){
        super(totalSales, e);
    }
    
    public BasedPlusCommisionEmployee(double totalSales, double baseSalary){
        super(totalSales);
        this.baseSalary=baseSalary;
    }
    
    public BasedPlusCommisionEmployee(double totalSales, int empID, String empName, double baseSalary){
        super(totalSales, empName, empID);
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary(){
        return super.computeSalary() + this.baseSalary;
    }

    public void displayBasedPlusCommisionEmployee(){
         System.out.println(toString()  + computeSalary());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BasedPlusCommisionEmployee{");
        sb.append("baseSalary=").append(baseSalary);
        sb.append('}');
        return sb.toString();
    }
}
