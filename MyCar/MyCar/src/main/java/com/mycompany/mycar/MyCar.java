/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mycar;

/**
 *
 * @author User
 */
public class MyCar {

    private static Vehicle SummiCar;
    
    public static void main (String[] args){
        SummiCar = new Vehicle(60, "Pink", "Seo", "Toyota", "ABC 1234", false);
        SummiCar.accelerate();
        SummiCar.accelerate();
        SummiCar.accelerate();
        SummiCar.accelerate();
        SummiCar.decelerate();
        SummiCar.accelerate();
        SummiCar.accelerate();
        SummiCar.accelerate();
        SummiCar.accelerate();
        SummiCar.repair();
        SummiCar.accelerate();
        SummiCar.accelerate();
    }
}
