package Question3.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class AreaOfTriangle {

    static double baseOfTriangle, heightOfTriangle, area;

    // input the baseOfTriangle and the heightOfTriangle
    void getInMeasurements() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs
        System.out.println("What is the base of the triangle: ");
        baseOfTriangle = input.nextDouble(); // store the input in baseOfTriangle
        System.out.println("What is the height of the triangle: ");
        heightOfTriangle = input.nextDouble(); // store the input in heightOfTriangle
    }

    // find the area of the rectangle
    void findArea() {
        area = 0.5 * baseOfTriangle * heightOfTriangle;
    }

    // method to output area
    void outputResults() {
        System.out.println("The area of the triangle is: " + area);
    }

    // main method
    public static void main(String[] args) {

        // calling the non-static methods
        AreaOfTriangle classObject = new AreaOfTriangle();
        classObject.getInMeasurements();
        classObject.findArea();
        classObject.outputResults();
    }
}
