
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:");
        int number = scanner.nextInt();

        while (number < 0) {
            System.out.print("Give a number:");
            number = scanner.nextInt();
            System.out.print("Unsuitable number");
            System.out.print("Give a number:");
        }
        while (number > 0) {
            System.out.print("Unsuitable number");
            System.out.print("Give a number:");
            number = scanner.nextInt();
            System.out.print(number);
            break;
        }
        while (number == 0) {
            System.out.print("Unsuitable number");
            System.out.print("Give a number:");
            number = scanner.nextInt();
            break;
        }
    }
}
