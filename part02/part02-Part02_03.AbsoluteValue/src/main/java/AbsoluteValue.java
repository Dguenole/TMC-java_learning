
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("The absolute value of the number is " + Math.abs(number));

    }
}
