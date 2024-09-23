/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version2;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(Employee e) {
        super(e.getEmpName(), e.getEmpID());
    }
    
    public PieceWorkerEmployee(String empName, int empID){
        super(empName, empID);    
    }
    
    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(Employee e, int totalPiecesFinished, double ratePerPiece) {
        super(e.getEmpName(), e.getEmpID());
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        super(empName, empID); 
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(){
        int pieces = totalPiecesFinished;
        double sal=0;

        while(pieces>=100){
            sal+=ratePerPiece*10;
            pieces-=100;
        }
        sal+=ratePerPiece*totalPiecesFinished;
        return sal;
    }
    
    
    public void displayPieceWorkerEmployee(){
         System.out.println(toString()  + computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PieceWorkerEmployee{");
        sb.append("totalPiecesFinished=").append(totalPiecesFinished);
        sb.append(", ratePerPiece=").append(ratePerPiece);
        sb.append('}');
        return sb.toString();
    }

    
}
