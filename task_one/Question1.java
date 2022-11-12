package task_one;

import java.util.Scanner; //importing Scanner 

public class Question1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //My scanner object
        
        //variables
        String srName;
        String oddEven;
        int age; 
        int numberOfChar;
        
        System.out.println("What is your sir name :");
        srName = input.nextLine(); //getting name
        System.out.println("What is your age :");
        age = input.nextInt(); //getting age

        //getting number of letters in sir name
        numberOfChar = srName.length();
        
        
        //if age is even or odd
        if (age % 2 == 0) {
            oddEven = "even";
            //Show output
        System.out.println("The number of letters in your sir name is : " + numberOfChar);
        System.out.println("Your current age is an " + oddEven + " number.");
        } else {
            oddEven = "odd";
            //Show output
        System.out.println("Your sir name has : " + numberOfChar + " characters");
        System.out.println("Your current age is an " + oddEven + " number.");
        }
    }
}