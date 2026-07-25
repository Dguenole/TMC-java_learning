
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(5);
        System.out.println(counter.value());
        counter.increase(2);
        System.out.println(counter.value());
        counter.decrease(1);
        System.out.println(counter.value());
    }
}
