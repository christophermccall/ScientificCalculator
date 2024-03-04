package com.zipcodewilmington.scientific_calculator;


import com.zipcodewilmington.scientificcalculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {
    Calculator calc = new Calculator();

    //TESTING CORE CALCULATOR FEATURES BELOW

    @Test //Testing Core Addition Function PASSED
    public void addTest() {
        calc.setCurrentValue(10);
        double result = calc.add(5);
        assertEquals(15, result,0.01);
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

    @Test //Testing Scientific Bin Con Function
    public void binConTest() {
        calc.setCurrentVal();
        int result = Integer.toBinaryString();
        assertEquals();
    }


    @Test //Testing Scientific Oc Con Function
    public void octConTest() {
        calc.setCurrentVal();
        int result = Integer.toOctalString();
        assertEquals();
    }

    @Test //Testing Scientific Dec Con Function
    public void decConTest() {
        calc.setCurrentVal();
        int result =
                assertEquals();
    }

    @Test //Testing Scientific hex Con Function
    public void hexConTest() {
        calc.setCurrentVal();
        int result = Integer.toHexString();
        assertEquals();
    }

    @Test //Testing Scientific Sine Function
    public void getSineTest() {
        calc.setCurrentVal();
        int result = sin(this.currentVal);
        assertEquals();
    }

    @Test //Testing Scientific Cosine Function
    public void getCosineTest() {
        calc.setCurrentVal();
        int result = cos(this.currentVal);
        assertEquals();
    }

    @Test //Testing Scientific Tangent Function
    public void getTangentTest() {
        calc.setCurrentVal();
        int result = tan(this.currentVal);
        assertEquals();
    }

    @Test //Testing Scientific Insine Function
    public void getInsineTest() {
        calc.setCurrentVal();
        int result = asin(this.currentVal);
        assertEquals();
    }

    @Test //Testing Scientific Incosine Function
    public void getIncosineTest() {
        calc.setCurrentVal();
        int result = acos(this.currentVal);
        assertEquals();
    }

    @Test //Testing Scientific Intangent Function
    public void getIntangentTest() {
        calc.setCurrentVal();
        int result = atan(this.currentVal);
        assertEquals();
    }

    
}