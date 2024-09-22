/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeseries.version1;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    private String empName;
    private int empID;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    
    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
        this.empName = empName;
        this.empID = empID;
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
        int pieces = totalPiecesFinished;
        double sal=0;
        //use divide, shorten
        while(pieces>=100){
            sal+=ratePerPiece*10;
            pieces-=100;
        }
        sal+=ratePerPiece*totalPiecesFinished;
        return sal;
    }

    void displayPieceWorkerEmployee(){
//        System.out.println("boang");
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "\nEmployee ID: " + empID + "\nEmployee Name: " + empName + "\nTotal Pieces Finished: " + totalPiecesFinished + "\nRate Per Piece: " + ratePerPiece + "\nTotal Salary: " + computeSalary();
    }
    
    

    
}
