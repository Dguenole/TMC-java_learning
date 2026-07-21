
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:");
        int number = scanner.nextInt();
        while (true) {
            if (number < 0) {
                System.out.println("Unsuitable number");
                System.out.print("Give a number:");
                number = scanner.nextInt();
            } else if (number == 0) {
                break;
            } else {
                System.out.println(number * number);
                System.out.print("Give a number:");
                number = scanner.nextInt();
            }
        }
    }
}
