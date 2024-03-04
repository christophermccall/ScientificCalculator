package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    private double currentValue;

    public Calculator() {
        this.currentValue = 0;
    }
    public double getCurrentValue(){
        return currentValue;
    }
    public void setCurrentValue(double currentValue){
        this.currentValue = currentValue;
    }

    public double add(double num){
        this.currentValue = this.currentValue + num;
        return this.currentValue;
    }
    public double sub(double num){
        this.currentValue = this.currentValue - num;
        return this.currentValue;
    }
    public double multiply(double num){
        this.currentValue = this.currentValue * num;
        return this.currentValue;
    }
    public double divide(double num){
        if(num == 0){
            Console.println("ERR");
        }
        else {this.currentValue = currentValue / num;}
        return this.currentValue;

    }
    public double squareRoot(){
        this.currentValue = Math.sqrt(this.currentValue);
        return this.currentValue;
    }
    public double square(){
        this.currentValue = this.currentValue * this.currentValue;
        return this.currentValue;
    }
    public double exponential(double x){
        this.currentValue = Math.pow(currentValue,x);
        return this.currentValue;
    }
    public double inverse(){
        this.currentValue = 1/currentValue;
        return this.currentValue;
    }
    public double invertSign(){
        this.currentValue = -currentValue;
        return this.currentValue;
    }

}
