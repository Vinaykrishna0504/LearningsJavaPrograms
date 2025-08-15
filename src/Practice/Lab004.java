package Practice;
import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter your name:");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age:");
//        int age = scanner.nextInt();
//
//        System.out.print("Enter your gpa:");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("Your age is " + age + "years old");
//        System.out.println("Your gpa is " + gpa);
//        System.out.println("Student: " + isStudent);
//        scanner.close();

        // Int after String problem(scanner.nextLine)

        System.out.print("Your age is: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favourite colour: ");
        String colour = scanner.nextLine();

        System.out.println("You are " + age + "years old");
        System.out.println("Your favourite colour is " + colour);
    }
}
