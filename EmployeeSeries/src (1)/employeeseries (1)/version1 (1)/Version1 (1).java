/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version1;

/**
 *
 * @author User
 */
public class Version1 {
    
    public static void main (String[] args) {
        System.out.println("\n\nHourly Employee:");
        
        HourlyEmployee p1 = new HourlyEmployee();
        p1.setEmpName("Soyeon");
        p1.setEmpID(12312);
        p1.setTotalHoursWorked(42.5f);
        p1.setRatePerHour(100);
        p1.displayHourlyEmployee();
        
        HourlyEmployee p2 = new HourlyEmployee("Miyeon", 0130);
        p2.setTotalHoursWorked(42.0f);
        p2.setRatePerHour(100);
        p2.displayHourlyEmployee();
        
        HourlyEmployee p3 = new HourlyEmployee(39f, 100.00, "Summi Derama", 1224);
        p3.displayHourlyEmployee();
        
        
        System.out.println("\n\nPiece Worker Employee:");
        
        PieceWorkerEmployee p4 = new PieceWorkerEmployee();
        p4.setEmpName("Soyeon");
        p4.setEmpID(12312);
        p4.setTotalPiecesFinished(250);
        p4.setRatePerPiece(100);
        p4.displayPieceWorkerEmployee();
        
        PieceWorkerEmployee p5 = new PieceWorkerEmployee("Minnie Yontararak", 1234);
        p5.setTotalPiecesFinished(50);
        p5.setRatePerPiece(100);
        p5.displayPieceWorkerEmployee();
        
        PieceWorkerEmployee p6 = new PieceWorkerEmployee(500, 100, "Seo Soojin", 0305);
        p6.displayPieceWorkerEmployee();
        
        
        System.out.println("\n\nCommision Employee:");
        
        CommisionEmployee p7 = new CommisionEmployee();
        p7.setEmpName("Soyeon");
        p7.setEmpID(12312);
        p7.setTotalSales(12000);
        p7.displayCommisionEmployee();
        
        CommisionEmployee p8 = new CommisionEmployee("Minnie Yontararak", 1234);
        p8.setTotalSales(120000);
        p8.displayCommisionEmployee();
        
        CommisionEmployee p9 = new CommisionEmployee(1200000, "Seo Soojin", 0305);
        p9.displayCommisionEmployee();
        
        
        System.out.println("\n\nBase Plus Commision Employee:");
        
        BasedPlusCommisionEmployee p10 = new BasedPlusCommisionEmployee();
        p10.setEmpName("Soyeon");
        p10.setEmpID(12312);
        p10.setTotalSales(12000);
        p10.setBaseSalary(60000);
        p10.displayBasedPlusCommisionEmployee();
        
        BasedPlusCommisionEmployee p11 = new BasedPlusCommisionEmployee("Minnie Yontararak", 1234);
        p11.setTotalSales(120000);
        p11.setBaseSalary(60000);
        p11.displayBasedPlusCommisionEmployee();
        
        BasedPlusCommisionEmployee p12 = new BasedPlusCommisionEmployee(1200000, 60000, "Seo Soojin", 0305);
        p12.displayBasedPlusCommisionEmployee();
        
        
        
    }
    
    
}
