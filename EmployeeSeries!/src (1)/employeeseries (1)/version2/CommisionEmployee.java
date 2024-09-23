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

    
    
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    
    
    
}
