import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) return true;
        if (!(compared instanceof Person)) return false;

        Person other = (Person) compared;
        return this.name.equals(other.name)
            && this.birthday.equals(other.birthday)
            && this.height == other.height
            && this.weight == other.weight;
    }

    public static void main(String[] args) {
        Person leevi = new Person("Leevi", new SimpleDate(1, 1, 2017), 70, 10);
    }
}