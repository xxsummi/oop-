/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycar;

/**
 *
 * @author User
 */
public class Vehicle {
    private int topSpeed;
    private int currSpeed;
    private String color;
    private String model;
    private String manufacturer;
    private String plateNumber;
    private boolean disabled;

    public Vehicle(int topSpeed, String color, String model, String manufacturer, String plateNumber, boolean disabled) {
        this.topSpeed = topSpeed;
        this.color = color;
        this.model = model;
        this.manufacturer = manufacturer;
        this.plateNumber = plateNumber;
        this.disabled = disabled;
    }

    public void setCurrSpeed() {
        this.currSpeed = 0;
    }
    
    public void repair(){
        disabled=false;
    }
    
    public boolean accelerate(){
        if(currSpeed+10<=topSpeed && disabled!=true){
            System.out.println("The" + color + "with a plate number " + plateNumber + "is accelerating from " + currSpeed + " kph to ");
            currSpeed+=10;
            System.out.println(currSpeed + " kph. \n");
            return true;
        } else{
            System.out.println("Engine overheated. Vehicle is now disabled.\n");
            return false;
        }
    }
    
    
    public boolean decelerate(){
        if(currSpeed>0){
            System.out.println("The" + color + "with a plate number " + plateNumber + "is decelerating from " + currSpeed + " kph to ");
            currSpeed-=10;
            System.out.println(currSpeed + " kph. \n");
            return true;
        } else{
            System.out.println("Can no longer decelerate, current speed is already at 0 kph.\n");
            return false;
        }
    }
    
    public void display(){
        System.out.println("Car\n\tcolor: " + color + "\n\tmodel: " + model + "\n\tmanufacturer: " + manufacturer + "\n\tplate number: " + plateNumber + "\n\ttop speed: " + topSpeed + "\n\tcurrent speed: " + currSpeed + "\n\tdisabled: " + disabled + "\n");
    }
    
    @Override
    public String toString(){
        return "Car\n\tcolor: " + color + "\n\tmodel: " + model + "\n\tmanufacturer: " + manufacturer + "\n\tplate number: " + plateNumber + "\n\ttop speed: " + topSpeed + "\n\tcurrent speed: " + currSpeed + "\n\tdisabled: " + disabled + "\n";
    }
}
