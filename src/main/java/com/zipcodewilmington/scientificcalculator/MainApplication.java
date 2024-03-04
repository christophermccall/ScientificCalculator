package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */


import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Console.println("\n" +
                "          _______  _        _______  _______  _______  _______ _________ _______  _______ \n" +
                "|\\     /|(  ____ \\( (    /|(  ___  )(  ____ \\(  ____ )(  ___  )\\__   __/(  ____ \\(  ____ \\\n" +
                "( \\   / )| (    \\/|  \\  ( || (   ) || (    \\/| (    )|| (   ) |   ) (   | (    \\/| (    \\/\n" +
                " \\ (_) / | (__    |   \\ | || |   | || |      | (____)|| (___) |   | |   | (__    | (_____ \n" +
                "  ) _ (  |  __)   | (\\ \\) || |   | || |      |     __)|  ___  |   | |   |  __)   (_____  )\n" +
                " / ( ) \\ | (      | | \\   || |   | || |      | (\\ (   | (   ) |   | |   | (            ) |\n" +
                "( /   \\ )| (____/\\| )  \\  || (___) || (____/\\| ) \\ \\__| )   ( |   | |   | (____/\\/\\____) |\n" +
                "|/     \\|(_______/|/    )_)(_______)(_______/|/   \\__/|/     \\|   )_(   (_______/\\_______)\n" +
                "                                                                                          \n");
        Console.println("Welcome to our calculator!");

        Calculator calculator = new Calculator();
        Scientific scientific = new Scientific();
        Console.println("\n%s\n", scientific.getCon());
        Console.println("\n%s\n", calculator.getCurrentValue());
        int userInput;
        String stringInput;
        while (true) {

            Console.println("1.) Clear Display");
            Console.println("2.) Change Current Value");
            Console.println("3.) Addition");
            Console.println("4.) Subtraction");
            Console.println("5.) Multiplication");
            Console.println("6.) Division");
            Console.println("7.) Square");
            Console.println("8.) Square Root");
            Console.println("9.) Exponential");
            Console.println("10.) Inverse");
            Console.println("11.) Invert Signs");
            Console.println("12.) Scientific Calc");


            // other operations
            Console.println("13.) Exit");

            userInput = Console.getIntegerInput("Please select from the following options: ");
            switch (userInput) {
                case 1:
                    // case for Clear screen
                    calculator.setCurrentValue(0);
                    //Console.println("\n%s\n", calculator.getCurrentValue());
                    break;
                case 2:
                    // Change current value
                    double newValue = Console.getDoubleInput("Please enter new value: ");
                    calculator.setCurrentValue(newValue);
                    break;
                case 3:
                    // for addition
                    double number = Console.getDoubleInput("Enter a value to add: ");
                    calculator.add(number);
                    break;
                case 4:
                    // for subtraction
                    double number1 = Console.getDoubleInput("Enter a value to subtract: ");
                    calculator.sub(number1);
                    break;
                case 5:
                    // for multiplication
                    double number2 = Console.getDoubleInput("Enter a value to multiply: ");
                    calculator.multiply(number2);
                    break;
                case 6:
                    // for division
                    double number3 = Console.getDoubleInput("Enter a value to divide: ");
                    calculator.divide(number3);
                    break;
                case 7:
                    // to find square of a number
                    calculator.square();
                    break;
                case 8:
                    // for square root
                    calculator.squareRoot();
                    break;

                case 9:
                    // for exponential
                    double number6 = Console.getDoubleInput("Enter a value of exponent: ");
                    calculator.exponential(number6);
                    break;

                case 10:
                    // for inverse of a number
                    calculator.inverse();
                    break;
                case 11:
                    // for invert signs
                    calculator.invertSign();
                    break;

                case 12:
                    while (true) {
                        Console.println("1.) Display");
                        Console.println("2.) Trig");
                        Console.println("3.) Memory");
                        Console.println("4.) Display Trig)");
                        Console.println("5.) Log Functions)");
                        Console.println("6.) Exit");


                        userInput = Console.getIntegerInput("select option");
                        switch (userInput) {
                            case 1:
                                while (true) {
                                    Console.println("1.) Binary");
                                    Console.println("2.) Octal");
                                    Console.println("3.) Decimal");
                                    Console.println("4.) Hexadecimal");
                                    Console.println("5.) Exit");

                                    userInput = Console.getIntegerInput("select option");
                                    switch (userInput) {
                                        case 1:
                                            //binary conversion here
                                            int num1 = Console.getIntegerInput("Enter a value of exponent: ");
                                            System.out.println(scientific.binCon(num1));
                                            break;

                                        case 2:
                                            //octal conversion
                                            int num2 = Console.getIntegerInput("Enter a value of exponent: ");
                                            System.out.println(scientific.octCon(num2));
                                            break;

                                        case 3:
                                            //decimal conversion
                                            int num3 = Console.getIntegerInput("Enter a value of exponent: ");
                                            System.out.println(scientific.decCon(num3));
                                            break;

                                        case 4:
                                            // hexadecimal conversion
                                            int num4 = Console.getIntegerInput("Enter a value of exponent: ");
                                            System.out.println(scientific.hexCon(num4));
                                            break;

                                        case 5:
                                            System.exit(0);
                                        default:
                                            Console.println("Invalid entry try again");
                                    }
                                }
                            case 2:
                                while (true) {
                                    Console.println("1.) Sin");
                                    Console.println("2.) Cos");
                                    Console.println("3.) Tan");
                                    Console.println("4.) Asin");
                                    Console.println("5.) Acos");
                                    Console.println("6.) Atan");
                                    Console.println("7.) Exit");

                                    userInput = Console.getIntegerInput("Please select from the following options: ");
                                    switch (userInput) {
                                        case 1:
                                            int num = Console.getIntegerInput("Enter a value");
                                            System.out.println(scientific.getSine(num));
                                            break;

                                        case 2:
                                            int num1 = Console.getIntegerInput("Enter a value");
                                            System.out.println(scientific.getCosine(num1));

                                            break;

                                        case 3:
                                            int num2 = Console.getIntegerInput("Enter a value");
                                            System.out.println(scientific.getTangent(num2));


                                            break;

                                        case 4:
                                            int num3 = Console.getIntegerInput("Enter a value");
                                            System.out.println(scientific.getInsine(num3));

                                            break;

                                        case 5:
                                            int num4 = Console.getIntegerInput("Enter a value");
                                            System.out.println(scientific.getIncosine(num4));


                                            break;

                                        case 6:
                                            int num5 = Console.getIntegerInput("Enter a value");
                                            System.out.println(scientific.getIntangent(num5));

                                            break;
                                        case 7:
                                            System.exit(0);
                                            break;
                                        default:
                                            Console.println("Invalid entry try again");
                                    }
                                }

                            case 3:
                                while (true) {
                                    Console.println("1.) M+ (add to memory)");
                                    Console.println("2.) print memory");
                                    Console.println("3.) Exit");
                                    userInput = Console.getIntegerInput("select option");

                                    switch (userInput) {
                                        case 1:
                                            //save to memory
                                            double file = Console.getDoubleInput("Enter number to save");

                                            scientific.setSave(file);
                                            break;
                                        case 2:
                                            //print memory
                                            System.out.println(scientific.getSave());
                                            break;

                                        case 3:
                                            System.exit(0);

                                            break;

                                        default:
                                            Console.println("Invalid entry try again");

                                    }
                                }
                            case 4:
                                while (true) {
                                    Console.println("1.) Degrees");
                                    Console.println("2.) Radians");

                                    userInput = Console.getIntegerInput("select option");
                                    switch (userInput) {

                                        case 1:
                                            double num = Console.getDoubleInput("Enter a value");
                                            System.out.println(scientific.degCon(num));

                                            break;

                                        case 2:

                                            double num1 = Console.getDoubleInput("Enter a value");
                                            System.out.println(scientific.radCon(num1));
                                            break;


                                        case 3:
                                            System.exit(0);
                                            break;

                                        default:
                                            Console.println("Invalid entry try again");

                                    }
                                }

                            case 5:
                                while(true) {
                                    Console.println("1.) Log");
                                    Console.println("2.) Inverse Log");
                                    Console.println("3.) Natural Log");
                                    Console.println("4.) Inverse Natural Log");
                                userInput = Console.getIntegerInput("select option");
                                switch (userInput) {
                                    case 1:
                                        double nums = Console.getDoubleInput("Enter a value");
                                        System.out.println(scientific.getLog(nums));
                                        break;

                                    case 2:
                                        double nums1 = Console.getDoubleInput("Enter a value");
                                        System.out.println(scientific.getInLog(nums1));
                                        break;
                                    case 3:
                                        double nums2 = Console.getDoubleInput("Enter a value");
                                        System.out.println(scientific.getLnlog(nums2));
                                        break;
                                    case 4:
                                        double nums3 = Console.getDoubleInput("Enter a value");
                                        System.out.println(scientific.getInLnLog(nums3));
                                        break;

                                    case 5:
                                        System.exit(0);
                                        break;

                                    default:
                                        Console.println("Invalid entry try again");
                                }
                                }

                                case 13:
                                // to exit
                                                             System.exit(0);
                            default:
                                Console.println("Invalid entry try again");

                        }
                        Console.println("\n%s\n", calculator.getCurrentValue());


                    }
            }
        }
    }
}