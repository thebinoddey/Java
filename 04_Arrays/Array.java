import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the size of array: ");
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        String[] name = {"A", "B", "C", "D", "E"};

        int[] brr = {23,13,14,43,56};
        int l = brr.length;


        
        System.out.println("Student Name : Marks");

        for (int i = 0; i < l; i++) {
            System.out.println(name[i] + " : " + brr[i]);
        }

        System.out.println("First element is:" + brr[0]);
        sc.close();
    }
}