/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version1;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    private float totalHoursWorked;
    private double ratePerHour;
    private String empName;
    private int empID;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    
    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empID = empID;
    }
    
    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
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
//        double sal;
//        if(totalHoursWorked<=40){
//            sal=totalHoursWorked*ratePerHour;
//        } else{
//            float ot=totalHoursWorked-40;
//            sal=40*ratePerHour;
//            sal+=ot*(ratePerHour*1.50);
//        }

        double ot = 0;
        float hours = totalHoursWorked;
        if(hours > 40) {
            ot = hours - 40;
            hours = 40f;
        }
        
        return hours * ratePerHour + ot * ratePerHour *1.5;
    }
    
    void displayHourlyEmployee(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "\nEmployee ID: " + empID + "\nEmployee Name: " + empName + "\nTotal Hours Worked: " + totalHoursWorked + "\nRate Per Hour: " + ratePerHour + "\nTotal Salary: " + computeSalary();
    }
    
    
}
