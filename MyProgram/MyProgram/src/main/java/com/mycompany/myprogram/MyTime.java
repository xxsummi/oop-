/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myprogram;

/**
 *
 * @author User
 */
public final class MyTime {
    private int hours;
    private int minutes;
    private int seconds;
    public boolean meridian;
    
    public MyTime() {
    
    }
    
    public MyTime(int hrs, int min, int sec) {
        setHours(hrs);
        setMinutes(min);
        setSeconds(sec);
    }

    public void setHours(int hours) {
        this.hours = (hours <= 12 && hours > 0) ? hours : 12;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes < 60 && minutes >= 0) ? minutes : 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds < 60 && seconds >= 0) ? seconds : 0;
    }

    public void tickBySecond(){
        seconds+=1;
        if(seconds>59){
            seconds=0;
            tickByMinute();
        }
    }
    
    public void tickByMinute(){
        minutes+=1;
        if(minutes>59){
            minutes=0;
            tickByHour();
        }
    }
    public void tickByHour(){
        hours+=1;
        if(hours>12){
            hours-=12;
        }
        
        setMeridian();
    }
    
    public String meridianChange() {
        return meridian ? "AM" : "PM";
    }
    
    public void setMeridian(){
        this.meridian = !this.meridian;
    }
    
    public void forwardTime(int seconds){
        this.seconds+=seconds;
        
        while(this.seconds>59){
            this.minutes+=1;
            this.seconds-=60;
            
            if(this.minutes>59){
                this.hours+=1;
                this.minutes-=60;
                
                  if(this.hours>12){
                   this.hours=1;
                   setMeridian();
                }
            }
        }
         
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.hours;
        hash = 89 * hash + this.minutes;
        hash = 89 * hash + this.seconds;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyTime other = (MyTime) obj;
        if (this.hours != other.hours) {
            return false;
        }
        if (this.minutes != other.minutes) {
            return false;
        }
        return this.seconds == other.seconds;
    }
}
