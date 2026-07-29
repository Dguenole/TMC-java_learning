import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner,SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement:");
        String statement = scanner.nextLine();

        while (!statement.equals("end")) {
            if (statement.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            } else if (statement.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                String translation = this.dictionary.translate(word);
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
            } else {
                System.out.println("Unknown statement");
            }
            System.out.println("\nStatement:");
            statement = scanner.nextLine();
        }
        System.out.println("Bye bye!");
    }
}
