package Question2;

import java.util.Scanner;

public class ProduceAverage {

    public static void main(String[] args) {

        // scanner object
        Scanner input = new Scanner(System.in);

        double javaMarks, networkingMarks, mathMarks, average; // my variables

        System.out.println("Enter marks for Java Programming: ");
        javaMarks = input.nextInt(); // get java marks
        System.out.println("Enter marks for Networking: ");
        networkingMarks = input.nextInt(); // get networking marks
        System.out.println("Enter marks for Maths: ");
        mathMarks = input.nextInt(); // get maths marks

        // output
        System.out.println("\nMarks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking: " + networkingMarks);
        System.out.println("Marks for Maths: " + mathMarks);

        // compute the average
        average = (javaMarks + networkingMarks + mathMarks) / 3;

        // output the average
        System.out.println("\nThe average is: " + average);
    }

}
