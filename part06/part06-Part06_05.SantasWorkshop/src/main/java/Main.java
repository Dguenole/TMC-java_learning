
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Gift> gifts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            gifts.add(new Gift("Gift " + (i + 1), (i + 1) * 10));
        }

        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's price: " + book.getPrice());

        System.out.println("Gift: " + book);
    }
}
