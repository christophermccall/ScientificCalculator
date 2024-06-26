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
        boolean isScientific = false;
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
                    System.out.println(calculator.multiply(number2));
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
                    isScientific = true;
                    while(isScientific) {

                        Console.println("\nDisplay: \"Bin\" \"Oct\" \"Dec\" \"Hex\"");
                        Console.println("Trig: \"Sin\" \"Cos\" \"Tan\" \"Asin\" \"Acos\" \"Atan\"");
                        Console.println("Memory: \"Add\"");
                        Console.println("Display Trig: \"Degrees\" \"Radians\"");
                        Console.println("Log Functions: \"Log\" \"InLog\" \"LnLog\" \"InLnLog\"");
                        Console.println("\"Exit\"\n");
                        stringInput = Console.getStringInput("Select one of the following option in quotes\n");

                        switch (stringInput) {
                            case "Bin":
                                //binary conversion here
                                int num1 = Console.getIntegerInput("Enter a value of exponent: ");
                                System.out.println(scientific.binCon(num1));
                                break;

                            case "Oct":
                                //octal conversion
                                int num2 = Console.getIntegerInput("Enter a value of exponent: ");
                                System.out.println(scientific.octCon(num2));
                                break;

                            case "Dec":
                                //decimal conversion
                                int num3 = Console.getIntegerInput("Enter a value of exponent: ");
                                System.out.println(scientific.decCon(num3));
                                break;

                            case "Hex":
                                // hexadecimal conversion
                                int num4 = Console.getIntegerInput("Enter a value of exponent: ");
                                System.out.println(scientific.hexCon(num4));
                                break;

                            case "Sin":
                                int num = Console.getIntegerInput("Enter a value");
                                System.out.println(scientific.getSine(num));
                                continue;

                            case "Cos":
                                int numa1 = Console.getIntegerInput("Enter a value");
                                System.out.println(scientific.getCosine(numa1));

                                break;

                            case "Tan":
                                int numa2 = Console.getIntegerInput("Enter a value");
                                System.out.println(scientific.getTangent(numa2));
                                break;

                            case "Asin":
                                int numa3 = Console.getIntegerInput("Enter a value");
                                System.out.println(scientific.getInsine(numa3));

                                break;

                            case "Acos":
                                int numa4 = Console.getIntegerInput("Enter a value");
                                System.out.println(scientific.getIncosine(numa4));
                                break;

                            case "Atan":
                                int num5 = Console.getIntegerInput("Enter a value");
                                System.out.println(scientific.getIntangent(num5));

                            case "Add":
                                //save to memory
                                double file = Console.getDoubleInput("Enter number to save");

                                scientific.setSave(file);
                                break;
                            case "print":
                                //print memory
                                System.out.println(scientific.getSave());
                                break;

                            case "Deg":
                                double numb = Console.getDoubleInput("Enter a value");
                                System.out.println(scientific.degCon(numb));

                                break;

                            case "Rad":

                                double numb1 = Console.getDoubleInput("Enter a value");
                                System.out.println(scientific.radCon(numb1));
                                break;

                            case "Log":
                                double nums = Console.getDoubleInput("Enter a value");
                                System.out.println(scientific.getLog(nums));
                                break;

                            case "InLog":
                                double nums1 = Console.getDoubleInput("Enter a value");
                                System.out.println(scientific.getInLog(nums1));
                                break;
                            case "LnLog":
                                double nums2 = Console.getDoubleInput("Enter a value");
                                System.out.println(scientific.getLnlog(nums2));
                                break;
                            case "InLnLog":
                                double nums3 = Console.getDoubleInput("Enter a value");
                                System.out.println(scientific.getInLnLog(nums3));
                                break;

                            case "Exit":
                                isScientific = false;
                                break;

                            default:
                                Console.println("Invalid entry try again");
                                break;
                        }
                    }
                    break;
                case 13:
                    // to exit
                    System.exit(0);
                    break;
                default:
                    Console.println("Invalid entry try again");

                }

                Console.println("\n%s\n", calculator.getCurrentValue());



            }
        }
    }
