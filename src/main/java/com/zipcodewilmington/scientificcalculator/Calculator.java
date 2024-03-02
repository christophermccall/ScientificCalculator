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
        this.currentValue = currentValue / num;
        return this.currentValue;
    }
    public double squareRoot(double x){
        this.currentValue = Math.sqrt(x);
        return this.currentValue;
    }
    public double square(double x){
        this.currentValue = x*x;
        return this.currentValue;
    }
}
