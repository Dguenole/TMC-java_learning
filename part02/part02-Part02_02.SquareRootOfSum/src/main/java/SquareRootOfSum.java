
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        double sum = first + second;
        System.out.println("The square root of the sum of the numbers is " + Math.sqrt(sum));

    }
}
