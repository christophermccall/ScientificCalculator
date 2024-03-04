package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Calculator; //Core
import org.junit.Test; // Core
import static org.junit.Assert.assertEquals; // Core

import java.lang.String; // Scientific
import java.util.Scanner; // Scientific
import static java.lang.Math.*; // Scientific
import com.zipcodewilmington.scientificcalculator.Scientific; // Scientific


public class TestMainApplication {

    //TESTING CORE CALCULATOR FEATURES BELOW
    Calculator calc = new Calculator();

    @Test //Testing Core Addition Function PASSED
    public void addTest() {
        calc.setCurrentValue(10);
        double result = calc.add(5);
        assertEquals(15, result, 0.01);
    }

    @Test //Testing Core Subtraction Function PASSED
    public void subTest() {
        calc.setCurrentValue(10);
        double result = calc.sub(5);
        assertEquals(5, result, 0.01);
    }

    @Test //Testing Core Multiplication Function PASSED
    public void multiplyTest() {
        calc.setCurrentValue(10);
        double result = calc.multiply(2);
        assertEquals(20, result, 0.01);
    }

    @Test //Testing Core Division Function PASSED
    public void divideTest() {
        calc.setCurrentValue(10);
        double result = calc.divide(2);
        assertEquals(5, result, 0.01);
    }

    @Test //Testing Core Square Function PASSED
    public void squareTest() {
        calc.setCurrentValue(10);
        double result = calc.square();
        assertEquals(100, result, 0.01);
    }

    @Test //Testing Core Square Root Function PASSED
    public void squareRootTest() {
        calc.setCurrentValue(100);
        double result = calc.squareRoot();
        assertEquals(10, result, 0.01);
    }

    @Test //Testing Core Exponential Function PASSED
    public void exponentialTest() {
        calc.setCurrentValue(10);
        double result = calc.exponential(2);
        assertEquals(100, result, 0.01);
    }

    @Test //Testing Core Inverse Function PASSED
    public void inverseTest() {
        calc.setCurrentValue(2);
        double result = calc.inverse();
        assertEquals(.5, result, 0.01);
    }

    @Test //Testing Core Invert Sign Function PASSED
    public void invertSignTest() {
        calc.setCurrentValue(-10);
        double result = calc.invertSign();
        assertEquals(10, result, 0.01);
    }



    // TESTING SCIENTIFIC CALCULATOR FEATURES BELOW
    Scientific scientific = new Scientific();

    @Test //Testing Scientific Bin Con Function PASSED
    public void binConTest() {
        int num = 10;
        String expectedResult = "1010";
        assertEquals(expectedResult, scientific.binCon(num));
    }

    @Test //Testing Scientific Oc Con Function
    public void octConTest() {
        int num1 = 20;
        String expectedResult = "24";
        assertEquals(expectedResult, scientific.octCon(num1));
    }

    /* @Test MISSING DEC CON SCIENTIFIC CODE
    public void decConTest() {
    } */

    @Test //Testing Scientific Hex Con
    public void hexConTest() {
        int num3 = 255;
        String expectedHex = "ff";
        assertEquals(expectedHex, scientific.hexCon(num3));
    }

    @Test //Testing Scientific DEG Con Function
    public void degConTest() {
        double num = -Math.PI;
        double expectedDegrees = -180.0;
        assertEquals(expectedDegrees, scientific.degCon(num), 0.001);
    }

    @Test //Testing Scientific Rad Con Function
    public void radConTest() {
        double num = 90.0;
        double expectedRadians = Math.PI / 2;
        assertEquals(expectedRadians, scientific.radCon(num), 0.001);
    }


    @Test //Testing Scientific Sine Function
    public void getSineTest() {
        int num4 = 30;
        double expectedSine = Math.sin(Math.toRadians(num4));
        assertEquals(expectedSine, scientific.getSine(num4), 0.001);
    }

    @Test //Testing Scientific Cosine Function
    public void getCosineTest() {
        int num5 = 60;
        double expectedCosine = Math.cos(Math.toRadians(num5));
        assertEquals(expectedCosine, scientific.getCosine(num5), 0.001);
    }

    @Test //Testing Scientific Tangent Function
    public void getTangentTest() {
        int num6 = 30;
        double expectedTangent = Math.tan(Math.toRadians(num6));
        double actualTangent = scientific.getTangent(num6);
        assertEquals(expectedTangent, actualTangent, 0.0001);
    }

    @Test //Testing Scientific Insine Function
    public void getInsineTest() {
        int num7 = 90;
        double expectedInsine = Math.asin(Math.toRadians(num7));
        double actualInsine = scientific.getInsine(num7);
        assertEquals(expectedInsine, actualInsine, 0.0001);
    }

    @Test //Testing Scientific Incosine Function
    public void getIncosineTest() {
        double num8 = 1;
        double expectedIncosine = Math.acos(num8);
        double actualIncosine = scientific.getIncosine(num8);
        assertEquals(expectedIncosine, actualIncosine, 0.0001);
    }

    @Test //Testing Scientific Intangent Function
    public void getIntangentTest() {
        double num9 = 0.5;
        double expectedIntangent = Math.atan(num9);
        double actualIntangent = scientific.getIntangent(num9);
        assertEquals(expectedIntangent, actualIntangent, 0.0001);
    }

    @Test //Testing Scientific Get Log Function
    public void getLogTest() {
        double nums = 100;
        double expectedLog = Math.log10(nums);
        double actualLog = scientific.getLog(nums);
        assertEquals(expectedLog, actualLog, 0.0001);
    }

    @Test //Testing Scientific Get In Log Function
    public void getInLogTest() {
        double nums1 = 100;
        double expectedInLog = Math.pow(Math.E, Math.log10(nums1));
        double actualInLog = scientific.getInLog(nums1);
        assertEquals(expectedInLog, actualInLog, 0.0001);
    }

    @Test // Testing Scientific Get Ln Log Function
    public void getLnLogTest() {
        double nums2 = 100;
        double expectedLnlog = Math.log(nums2);
        double actualLnlog = scientific.getLnlog(nums2);
        assertEquals(expectedLnlog, actualLnlog, 0.0001);
    }

    @Test // Testing Scientific Get In Ln Log Function
    public void getInLnLogTest() {
        double nums3 = 100;
        double expectedInLnLog = Math.pow(Math.E, Math.log(nums3));
        double actualInLnLog = scientific.getInLnLog(nums3);
        assertEquals(expectedInLnLog, actualInLnLog, 0.0001);
    }

    @Test // Testing Set Save and Get Save
    public void getSaveAndSetSaveTest() {
        double saveValue = 10.5;
        double result = scientific.setSave(saveValue);
        assertEquals(saveValue, result, 0.0001);
        double savedValue = scientific.getSave();
        assertEquals(saveValue, savedValue, 0.0001);
    }

    @Test // Testing Get Con and Set Con
    public void testGetConAndSetCon() {
        String initialCon = "Hello World";
        scientific.setCon(initialCon);
        String retrievedCon = scientific.getCon();
        assertEquals(initialCon, retrievedCon);
    }
    
}