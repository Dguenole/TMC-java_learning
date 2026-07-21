
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        while (number != 0) {
            sum += number;
            System.out.print("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Sum of the numbers: " + sum);


    }
}
