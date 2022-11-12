package task_one;

import java.util.Scanner; //Sannner import

public class Question3 {

    //using the modulus to simplify tests
    
    //testing divisibility of the argument by 0
    static void myTestFor0(int numEntered) {
        System.out.println(numEntered + " cannot be divisible by 0.");
    }

    //testing divisibility of the argument by 1
    static void myTestFor1(int numEntered) {
        System.out.println(numEntered + " is divisible by 1.");
    }

    //testing divisibility of the argument by 2
    static void myTestFor2(int numEntered) {
        if (numEntered % 2 == 0) {
            System.out.println(numEntered + " is divisible by 2.");
        } else {
            System.out.println(numEntered + " is not divisible by 2.");
        }
    }

    //testing divisibility of the argument by 3
    static void myTestFor3(int numEntered) {
        if ((numEntered % 3) == 0) {
            System.out.println(numEntered + " is divisible by 3");
        } else {
            System.out.println(numEntered + " is not divisible by 3");
        }
    }

    //testing divisibility of the argument by 4
    static void myTestFor4(int numEntered) {
        if ((numEntered % 4) == 0) {
            System.out.println(numEntered + " is divisible by 4");
        } else {
            System.out.println(numEntered + " is not divisible by 4");
        }
    }

    //testing divisibility of the argument by 5
    static void myTestFor5(int numEntered) {
    if ((numEntered % 5) == 0) {
            System.out.println(numEntered + " is divisible by 5");
        } else {
            System.out.println(numEntered + " is not divisible by 5");
        }
    }

    //testing divisibility of the argument by 6
    static void myTestFor6(int numEntered) {
        if ((numEntered % 6) == 0) {
            System.out.println(numEntered + " is divisible by 6");
        } else {
            System.out.println(numEntered + " is not divisible by 6");
        }
    }

    //testing divisibility of the argument by 7
    static void myTestFor7(int numEntered) {
        if ((numEntered % 7) == 0) {
            System.out.println(numEntered + " is divisible by 7");
        } else {
            System.out.println(numEntered + " is not divisible by 7");
        }
    }

    //testing divisibility of the argument by 8
    static void myTestFor8(int numEntered) {
        if ((numEntered % 8) == 0) {
            System.out.println(numEntered + " is divisible by 8");
        } else {
            System.out.println(numEntered + " is not divisible by 8");
        }
    }

    //testing divisibility of the argument by 9
    static void myTestFor9(int numEntered) {
        if ((numEntered % 9) == 0) {
            System.out.println(numEntered + " is divisible by 9");
        } else {
            System.out.println(numEntered + " is not divisible by 9");
        }
    }


    //the main method
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);


        int numToTest;
        //getting input
        System.out.println("This program checks if numbers are divisibile by zero to 9. Enter any number :");        
        numToTest = input.nextInt();

        //calling the methods shown above
        myTestFor0(numToTest);
        myTestFor1(numToTest);
        myTestFor2(numToTest);
        myTestFor3(numToTest);
        myTestFor4(numToTest);
        myTestFor5(numToTest);
        myTestFor6(numToTest);
        myTestFor7(numToTest);
        myTestFor8(numToTest);
        myTestFor9(numToTest);
    }
}
