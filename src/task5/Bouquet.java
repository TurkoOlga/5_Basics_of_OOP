package task5;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private final List<Flower> flowers = new ArrayList<>();
    private FlowerPackaging flowerPackaging;

    private Bouquet() {
    }

    public static Builder newBuilder() {
        return new Bouquet().new Builder();
    }

    public FlowerPackaging getFlowerPackaging() {
        return flowerPackaging;
    }

    public List<Flower> getFlower() {
        return flowers;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowerPackaging=" + flowerPackaging +
                ", flower=" + flowers +
                '}';
    }

    public class Builder {

        private Builder() {
        }

        public Builder setFlowerPackaging(FlowerPackaging flowerPackaging) {
            Bouquet.this.flowerPackaging = flowerPackaging;
            return this;
        }

        public Builder setFlower(FlowerType name, int cost, int number) {
            Flower flower = new Flower(name, cost, number);
            Bouquet.this.flowers.add(flower);
            return this;
        }

        public Bouquet build() {
            return Bouquet.this;
        }

    }
}
