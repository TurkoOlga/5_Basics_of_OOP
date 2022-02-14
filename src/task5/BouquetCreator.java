package task5;

public class BouquetCreator {

    public Bouquet createBouquet() {
        FlowerPackaging flowerPackaging = new FlowerPackaging("green", 2);
        return Bouquet.newBuilder()
                .setFlowerPackaging(flowerPackaging)
                .setFlower(FlowerType.LILY, 12, 1)
                .setFlower(FlowerType.CAMOMILE, 3, 2)
                .setFlower(FlowerType.ROSE, 22, 2)
                .build();
    }

}
