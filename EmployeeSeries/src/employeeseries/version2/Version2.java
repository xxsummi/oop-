/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version2;

/**
 *
 * @author User
 */
public class Version2 {
    public static void main(String[] args) {
        // Employee instances
        Employee emp1 = new Employee("John Doe", 101);
        Employee emp2 = new Employee("Jane Smith", 102);
        Employee emp3 = new Employee(); // Default constructor

        // Commission Employee instances
        CommisionEmployee commEmp1 = new CommisionEmployee(); // Default constructor
        CommisionEmployee commEmp2 = new CommisionEmployee(1500); // Total sales only
        CommisionEmployee commEmp3 = new CommisionEmployee(emp1); // Using Employee object
        CommisionEmployee commEmp4 = new CommisionEmployee("Alice Johnson", 201); // Using name and ID
        CommisionEmployee commEmp5 = new CommisionEmployee(emp2, 2500); // Using Employee object and total sales
        CommisionEmployee commEmp6 = new CommisionEmployee(3000, "Bob Brown", 202); // Using sales, name, and ID

        // Based Plus Commission Employee instances
        BasedPlusCommisionEmployee basedCommEmp1 = new BasedPlusCommisionEmployee(); // Default constructor
        BasedPlusCommisionEmployee basedCommEmp2 = new BasedPlusCommisionEmployee(emp1); // Using Employee object
        BasedPlusCommisionEmployee basedCommEmp3 = new BasedPlusCommisionEmployee(2000, emp2); // Using total sales and Employee object
        BasedPlusCommisionEmployee basedCommEmp4 = new BasedPlusCommisionEmployee(3000, 500); // Using sales and base salary
        BasedPlusCommisionEmployee basedCommEmp5 = new BasedPlusCommisionEmployee(10000, 203, "Charlie Green", 600); // Full constructor

        // Hourly Employee instances
        HourlyEmployee hourlyEmp1 = new HourlyEmployee(); // Default constructor
        HourlyEmployee hourlyEmp2 = new HourlyEmployee(emp1); // Using Employee object
        HourlyEmployee hourlyEmp3 = new HourlyEmployee(45, 20); // Hours, rate
        HourlyEmployee hourlyEmp4 = new HourlyEmployee(emp2, 40, 25); // Employee object, hours, rate
        HourlyEmployee hourlyEmp5 = new HourlyEmployee(50, 15, "Diana Black", 204); // Hours, rate, name, ID

        // Piece Worker Employee instances
        PieceWorkerEmployee pieceWorkerEmp1 = new PieceWorkerEmployee(); // Default constructor
        PieceWorkerEmployee pieceWorkerEmp2 = new PieceWorkerEmployee(emp2); // Using Employee object
        PieceWorkerEmployee pieceWorkerEmp3 = new PieceWorkerEmployee(200, 5.0); // Pieces, rate
        PieceWorkerEmployee pieceWorkerEmp4 = new PieceWorkerEmployee(emp1, 300, 4.0); // Employee object, pieces, rate
        PieceWorkerEmployee pieceWorkerEmp5 = new PieceWorkerEmployee(400, 3.5, "Eve White", 205); // Pieces, rate, name, ID

        // Display employee information using all constructors
        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee(); // Default employee

        commEmp1.displayCommisionEmployee();
        commEmp2.displayCommisionEmployee();
        commEmp3.displayCommisionEmployee();
        commEmp4.displayCommisionEmployee();
        commEmp5.displayCommisionEmployee();
        commEmp6.displayCommisionEmployee();

        basedCommEmp1.displayBasedPlusCommisionEmployee();
        basedCommEmp2.displayBasedPlusCommisionEmployee();
        basedCommEmp3.displayBasedPlusCommisionEmployee();
        basedCommEmp4.displayBasedPlusCommisionEmployee();
        basedCommEmp5.displayBasedPlusCommisionEmployee();

        hourlyEmp1.displayHourlyEmployee(); // Default hourly employee
        hourlyEmp2.displayHourlyEmployee(); // Using Employee object
        hourlyEmp3.displayHourlyEmployee();
        hourlyEmp4.displayHourlyEmployee();
        hourlyEmp5.displayHourlyEmployee();

        pieceWorkerEmp1.displayPieceWorkerEmployee(); // Default piece worker
        pieceWorkerEmp2.displayPieceWorkerEmployee(); // Using Employee object
        pieceWorkerEmp3.displayPieceWorkerEmployee();
        pieceWorkerEmp4.displayPieceWorkerEmployee();
        pieceWorkerEmp5.displayPieceWorkerEmployee();
    }
}
