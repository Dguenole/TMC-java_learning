
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int count = 0;

        while (number != 0) {
            if (number > 0) {
                sum += number;
                count++;
            }
            System.out.print("Give a number: ");
            number = Integer.valueOf(scanner.nextLine());
        }

        if (count > 0) {
            System.out.println((double) sum / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
