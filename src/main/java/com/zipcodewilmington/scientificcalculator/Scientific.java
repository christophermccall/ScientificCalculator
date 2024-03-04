
package com.zipcodewilmington.scientificcalculator;
import java.lang.String;
import java.util.Scanner;

import static java.lang.Math.*;

public class Scientific {
    private String con;

    private double save;

    private double currentVal;

    public Scientific() {
        this.con = "";
        this.currentVal = currentVal;


    }

    public double getSave() {
        return save;
    }

    public double setSave(double save) {

        this.save = this.currentVal+= save;
        return this.save;

    }


    public String getCon (){
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    public String binCon(int num) {
        this.con = Integer.toBinaryString(num);
        return this.con;
    }

    public String octCon (int num1) {

        this.con = Integer.toOctalString(num1);

        return this.con;
    }

    public String decCon(int num2) { //Danny : MISSING decCon CODE

        return this.con;
    }

    public String hexCon(int num3) {

        this.con = Integer.toHexString(num3);

        return this.con;
    }


    public double degCon(double num) {

        this.currentVal = toDegrees(num);

        return this.currentVal;
    }


    public double radCon(double num) {

        this.currentVal = toRadians(num);

        return this.currentVal;
    }

    public double getSine(int num4){
        this.currentVal = sin(num4);
        return this.currentVal;

    }

    public double getCosine(int num5){
        this.currentVal = cos(num5);
        return this.currentVal;

    }

    public double getTangent(int num6){
        this.currentVal = tan(num6);
        return this.currentVal;

    }

    public double getInsine(int num7){
        this.currentVal = asin(toRadians(num7));
        return this.currentVal;

    }

    public double getIncosine(double num8){ //Danny : changed int to double
        this.currentVal = acos(num8);
        return this.currentVal;

    }

    public double getIntangent(double num9){ //Danny : changed int to double
        this.currentVal = atan(num9);
        return this.currentVal;

    }

    public double getLog(double nums){
        this.currentVal = log10(nums);
        return this.currentVal;

    }

    public double getInLog(double nums1){
        this.currentVal = Math.pow(Math.E, (Math.log10(nums1)));
        return this.currentVal;

    }
    public double getLnlog(double nums2){
        this.currentVal = log(nums2);
        return this.currentVal;

    }
    public double getInLnLog(double nums3){
        this.currentVal = Math.pow(Math.E, (Math.log(nums3)));
        return this.currentVal;

    }




}


