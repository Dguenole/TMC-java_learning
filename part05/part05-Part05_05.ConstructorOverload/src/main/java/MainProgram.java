
public class MainProgram {

    public static void main(String[] args) {
        Product product1 = new Product("Milk", "fridge", 2);
        Product product2 = new Product("Cheese", "fridge");
        Product product3 = new Product("Bread", 1);
        Product product4 = new Product("Butter");

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
    }
}
