package task_one;

import java.util.Scanner; //importing Scanner

public class Question5 {

    //calculations are done in this method returning void
    static void calculations(double num1, double num2, char operator) {
      
        
        Double operationResult; //to store output

        switch (operator) {

            //subtraction
            case '-':
                operationResult = num1 - num2;
                System.out.println("The operationResult is: " + operationResult);
                break;

            //addition
            case '+':
                operationResult = num1 + num2;
                System.out.println("The operationResult is: " + operationResult);
                break;

            //multiplication
            case '*':
                operationResult = num1 * num2;
                System.out.println("The operationResult is: " + operationResult);
                break;

            //division
            case '/':
                operationResult = num1 / num2;
                System.out.println("The operationResult is: " + operationResult);
                break;

            default:
                System.out.println("Please try again.");
                break;
        }
    }

    //main method
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in); // Scanner object

        System.out.println("Enter the first number");
        Double num1;
        num1 = data.nextDouble(); //input first number

        // request the the operator from the user
        System.out.println("Enter your operator (+, -, *, /): ");
        char operator;
        operator = data.next().charAt(0); //input the operator

        // request the second number from the user
        System.out.println("Enter second number");
        Double num2;
        num2 = data.nextDouble(); //input second number

        calculations(num1, num2, operator);
    }
}