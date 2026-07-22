import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] parts = line.split(",");
            int age = Integer.valueOf(parts[1].trim());

            if (age > oldest) {
                oldest = age;
            }
        }

        System.out.println("Age of the oldest: " + oldest);
    }
}