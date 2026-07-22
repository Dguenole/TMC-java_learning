
import java.util.Scanner;
import java.util.ArrayList;

public class LastWords {

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
            System.out.println(words[words.length - 1]);
        }


    }
}
