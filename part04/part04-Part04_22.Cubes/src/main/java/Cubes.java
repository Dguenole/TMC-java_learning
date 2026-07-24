
import java.util.Scanner;
import java.util.ArrayList;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> cubes = new ArrayList<>();
        System.out.print("");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;      
            }

            System.out.println(Integer.valueOf(input) * Integer.valueOf(input) * Integer.valueOf(input));
            //cubes.add(Integer.valueOf(input) * Integer.valueOf(input) * Integer.valueOf(input));
        }


    }
}
