import java.util.Scanner;

public class print1tn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int range = sc.nextInt();

        int counter = 1;
        while (counter <= range) {
            System.out.println(counter);  // Print current number
            counter++;
        }

        sc.close(); // Good practice to close the scanner
    }
}
