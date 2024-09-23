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

    
    
    public BasedPlusCommisionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    
}
