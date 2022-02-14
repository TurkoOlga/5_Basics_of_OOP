package task5;

import java.util.List;

public class FlowerShop {
    private static FlowerShop flowerShop;

    private FlowerShop() {
    }

    public static FlowerShop getFlowerShop() {
        if (flowerShop == null) {
            flowerShop = new FlowerShop();
        }
        return flowerShop;
    }

    public int countBouquetCost(Bouquet bouquet) {
        int result = 0;
        int flowerPackagingCost = bouquet.getFlowerPackaging().getCost();
        int flowerCost = 0;
        List<Flower> flowers = bouquet.getFlower();
        for (Flower flower : flowers) {
            flowerCost = flower.getCost();
            result += flowerCost;
        }
        result = flowerCost + flowerPackagingCost;
        return result;
    }


}
