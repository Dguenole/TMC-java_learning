
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;      
            }

            strings.add(input);
        }
        System.out.println(strings.size());


    }
}
