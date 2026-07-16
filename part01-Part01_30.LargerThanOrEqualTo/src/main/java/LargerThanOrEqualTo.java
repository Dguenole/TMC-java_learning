
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int first = scan.nextInt();
        System.out.print("Give the second number: ");
        int second = scan.nextInt();
        if (first > second) {
            System.out.println("The larger number is: " + first);
        } else if (first < second) {
            System.out.println("The larger number is: " + second);
        } else {
            System.out.println("The numbers are equal.");
        }
    }
}
