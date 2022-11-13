package Question1.methods_in_java.methods;

import java.util.Scanner; //Scanner import

public class Methods {

    // this method will return the smallest num
    static double smallNumber(double num_1, double num_2, double num_3) {

        if (num_1 < num_2) {
            // if true, is num_1 > num_3
            if (num_1 < num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            // else false, is num_2 < num_3
            if (num_2 < num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

    // this method will return the largest num
    static double largeNumber(double num_1, double num_2, double num_3) {

        // get largest number
        if (num_1 > num_2) {
            if (num_1 > num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            if (num_2 > num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

    // main method
    public static void main(String[] args) {

        // variables
        double num1, num2, num3, smallnum, largenum;

        Scanner input = new Scanner(System.in);// scanner object

        // getting input
        System.out.println("\nEnter the first number: ");
        num1 = input.nextInt(); // input first number
        System.out.println("Enter the second number: ");
        num2 = input.nextInt(); // input second number
        System.out.println("Enter the third number: ");
        num3 = input.nextInt(); // input third number

        // get return values fom the methods
        smallnum = smallNumber(num1, num2, num3);
        largenum = largeNumber(num1, num2, num3);

        // output
        System.out.println("\nThe smallest number: " + smallnum);
        System.out.println("The largest number: " + largenum);
        System.out.println(largenum + " is your largest and " + smallnum + " is the smallest number.");
    }
}
