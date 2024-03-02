package com.zipcodewilmington.scientificcalculator;


/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//         Console.println("The user input %s as a d", d);

        Calculator calculator = new Calculator();
        Console.println("%s", calculator.getCurrentValue());
        //Console.getUserOperation()
        int userInput;
        while(true){

            Console.println("1.) Clear Display");
            Console.println("2.) Change Current Value");
            Console.println("3.) Addition");
            Console.println("4.) Subtraction");
            Console.println("5.) Multiplication");
            Console.println("6.) Division");

            // other operations
            Console.println("7.) Exit");
            userInput = Console.getIntegerInput("Please select from the following options: ");
            switch (userInput){
                case 1:
                    calculator.setCurrentValue(0);
                    Console.println("%s", calculator.getCurrentValue());
                    break;
                case 2:
                    double newValue = Console.getDoubleInput("Please enter new value: ");
                    calculator.setCurrentValue(newValue);
                    break;
                case 7:
                    System.exit(0);
                default:
                    Console.println("Invalid entry try again");

        }


        }
    }
}
