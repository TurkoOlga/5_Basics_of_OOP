package task5;

public class FlowerPackaging {
    private String colour;
    private int cost;

    public FlowerPackaging(String colour, int cost) {
        validateData(cost);
        this.colour = colour;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "FlowerPackaging{" +
                "colour='" + colour + '\'' +
                '}';
    }

    private void validateData(int cost) {
        if (cost <= 0) {
            throw new IllegalArgumentException("Cost should be greater than zero");
        }
    }
}
