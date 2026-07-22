
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldestAge = 0;

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] parts = line.split(",");
            String name = parts[0].trim();
            int age = Integer.valueOf(parts[1].trim());

            if (age > oldestAge) {
                oldestAge = age;
                oldestName = name;
            }
        }
        System.out.println("Name of the oldest: " + oldestName);


    }
}
