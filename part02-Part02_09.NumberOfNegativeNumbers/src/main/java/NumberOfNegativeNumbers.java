
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:");
        int number = scanner.nextInt();
        int count = 0;

        while (number != 0) {
            if (number < 0) {
                count++;
            }
            System.out.print("Give a number:");
            number = scanner.nextInt();
        }

        System.out.println("Number of negative numbers: " + count);
        
    }
}
