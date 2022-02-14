package task5;

public class Flower {
    private FlowerType name;
    private int cost;
    private int amount;

    public Flower(FlowerType name, int cost, int amount) {
        validateData(cost, amount);
        this.name = name;
        this.cost = cost;
        this.amount = amount;
    }

    public FlowerType getName() {
        return name;
    }

    public void setName(FlowerType name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name=" + name +
                ", cost=" + cost +
                ", number=" + amount +
                '}';
    }

    private void validateData(int cost, int amount) {
        if (cost <= 0) {
            throw new IllegalArgumentException("Cost should be greater than zero");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount should be greater than zero");
        }
    }
}
