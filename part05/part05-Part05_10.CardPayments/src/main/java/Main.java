
public class Main {

    public static void main(String[] args) {
        // PaymentCard petesCard = new PaymentCard(10);
        // System.out.println("Balance: " + petesCard.balance());
        // boolean wasSuccessful = petesCard.takeMoney(8);
        // System.out.println("Success: " + wasSuccessful);
        // System.out.println("Balance: " + petesCard.balance());

        // wasSuccessful = petesCard.takeMoney(4);
        // System.out.println("Success: " + wasSuccessful);
        // System.out.println("Balance: " + petesCard.balance());  

        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);
    }
}

