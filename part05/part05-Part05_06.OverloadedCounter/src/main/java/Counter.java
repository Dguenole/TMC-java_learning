public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    // Sans paramètre → augmente de 1
    public void increase() {
        this.value++;
    }

    // Avec paramètre → augmente seulement si positif
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    // Sans paramètre → diminue de 1
    public void decrease() {
        this.value--;
    }

    // Avec paramètre → diminue seulement si positif
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }
}