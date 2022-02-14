package task4;

public class Treasure implements Comparable<Treasure> {
    private int id;
    private int cost;

    public Treasure(int id, int cost) {
        this.id = id;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "id=" + id +
                ", cost=" + cost +
                '}';
    }


    @Override
    public int compareTo(Treasure otherTreasure) {
        return Integer.compare(getCost(), otherTreasure.getCost());
    }
}
