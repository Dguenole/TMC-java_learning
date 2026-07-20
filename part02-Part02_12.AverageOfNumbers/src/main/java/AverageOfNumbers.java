
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int count = 0;
        while (number != 0) {
            sum += number;
            count++;
            System.out.print("Give a number: ");
            number = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Average of the numbers: " + (double) sum / count);

    }
}
