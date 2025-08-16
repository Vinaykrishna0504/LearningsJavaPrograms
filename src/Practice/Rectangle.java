package Practice;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

//        Calculate area of a rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area of the rectangle is " + area + "cm");
        scanner.close();
    }
}

//Either this can be done
//        System.out.print("Enter the width: ");
//double width = scanner.nextDouble();
//
//        System.out.print("Enter the height: ");
//double height = scanner.nextDouble();
//
//double area = width * height;
//
//        System.out.println("The area of the rectangle is " + area + "cm");