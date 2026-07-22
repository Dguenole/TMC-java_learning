import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sumOfBirthYears = 0;
        int count = 0;

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            
            String[] parts = line.split(",");
            String name = parts[0].trim();
            int birthYear = Integer.valueOf(parts[1].trim());

            if (name.length() > longestName.length()) {
                longestName = name;
            }

            sumOfBirthYears += birthYear;
            count++;
        }

        if (count > 0) {
            double average = (double) sumOfBirthYears / count;
            System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + average);
        }
    }
}