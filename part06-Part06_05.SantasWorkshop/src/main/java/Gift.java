public class Gift {
    
    private String name;
    private int price;

    public Gift(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void addGift(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int totalWeight() {
        return this.price;
    }

    public int getWeight() {
        return this.price;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) return true;
        if (!(compared instanceof Gift)) return false;

        Gift other = (Gift) compared;
        return this.name.equals(other.name)
            && this.price == other.price;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.price + ")";
    }
}
