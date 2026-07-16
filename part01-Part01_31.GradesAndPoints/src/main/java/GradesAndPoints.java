
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give points: [0-100] ");
        int points = scan.nextInt();        
        if (points >= 0 && points <= 100) {
            if (points >= 90) {
                System.out.println("Grade: 5");
            } else if (points >= 80) {
                System.out.println("Grade: 4");
            } else if (points >= 70) {
                System.out.println("Grade: 3");
            } else if (points >= 60) {
                System.out.println("Grade: 2");
            } else {
                System.out.println("Grade: Failed");
            }
        } else {
            System.out.println("Invalid points. Please enter a value between 0 and 100.");
        }
    }
}
