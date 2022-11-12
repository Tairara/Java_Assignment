package task_one;

import java.util.Scanner; //importing Scanner

public class Question2 {

    //this method calculates the average
    static double findAverage(double num1, double num2, double num3, double num4, double num5) {
        
        
        // finding the average
        double myAverage;
        myAverage = (num1 + num2 + num3 + num4 + num5) / 5;
        
        
        // rounding the average to 2dp
        var roundedAverage = Math.round(myAverage * 100.0) / 100.0;
        
        return roundedAverage;
    }

    // main method
    public static void main(String[] args) {

        // my scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for the units you did on last semester to get the average.");

        // getting the units as entered at the console
        System.out.println("Unit 1: ");
        double unit_1;
        unit_1 = input.nextDouble();
        System.out.println("Unit 2: ");
        double unit_2;
        unit_2 = input.nextDouble();
        System.out.println("Unit 3: ");
        double unit_3;
        unit_3 = input.nextDouble();
        System.out.println("Unit 4: ");
        double unit_4;
        unit_4 = input.nextDouble();
        System.out.println("Unit 5: ");
        double unit_5;
        unit_5 = input.nextDouble();


        
        //calling findAverage method and putting the return value in variable average
        double average = findAverage(unit_1, unit_2, unit_3, unit_4, unit_5);

        

        System.out.println("\nYour average mark is: " + average);
    }

}
