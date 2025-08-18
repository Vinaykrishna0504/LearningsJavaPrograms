package Practice;
import java.util.Scanner;

public class MathExerciseHypotenuse {
    public static void main(String[] args) {

        // Hypotenuse c = math.sqrt(a2 + b2);

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse of (side c) = " + c + "cm");

        scanner.close();
    }
}
