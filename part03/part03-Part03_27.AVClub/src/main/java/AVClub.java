
import java.util.ArrayList;
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            input.add(line);
        }   
        for (String line : input) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }

    }
}
