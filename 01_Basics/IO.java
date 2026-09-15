import java.util.Scanner;

public class IO {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Output
        System.out.println("===== STUDENT DETAILS =====");

        // Input String
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Input integer
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Input double
        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        // Output
        System.out.println("\n===== OUTPUT =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

        // Close Scanner
        sc.close();
    }
}