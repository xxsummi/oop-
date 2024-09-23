/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version2;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
    }
    
    public HourlyEmployee(Employee e) {
        super(e.getEmpName(), e.getEmpID());
    }

    public HourlyEmployee(String empName, int empID){
        super(empName, empID);    
    }
    
    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(Employee e, float totalHoursWorked, double ratePerHour) {
        super(e.getEmpName(), e.getEmpID());
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
        super(empName, empID);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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
    
    public double computeSalary(){
        double ot = 0;
        float hours = totalHoursWorked;
        if(hours > 40) {
            ot = hours - 40;
            hours = 40f;
        }
        return hours * ratePerHour + ot * ratePerHour *1.5;
    }

    public void displayHourlyEmployee(){
         System.out.println(toString()  + computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HourlyEmployee{");
        sb.append("totalHoursWorked=").append(totalHoursWorked);
        sb.append(", ratePerHour=").append(ratePerHour);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
