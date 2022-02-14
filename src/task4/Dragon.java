package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Dragon {
    private String name;
    private int size;
    private List<Treasure> treasures = new ArrayList<>();

    public Dragon(String name, int size, List<Treasure> treasures) {
        this.name = name;
        this.size = size;
        this.treasures = treasures;
    }

    public void printTreasures() {
        for (Treasure treasure : treasures) {
            System.out.println(treasure);
        }
    }

    public List<Treasure> getMaxCostTreasure() {
        List<Treasure> result = new ArrayList<>();
        List<Treasure> treasuresCopy = new ArrayList<>(treasures);
        Collections.sort(treasuresCopy);

        Treasure treasureMaxCost = treasuresCopy.get(treasuresCopy.size() - 1);
        for (int i = treasuresCopy.size() - 1; i >= 0; i--) {
            Treasure treasureInList = treasuresCopy.get(i);
            if (treasureInList.getCost() == treasureMaxCost.getCost()) {
                result.add(treasureInList);
            }
        }
        return result;
    }

    public List<Treasure> getTreasureByMoneySum(int sum) {
        List<Treasure> result = new ArrayList<>();
        for (Treasure treasure : treasures) {
            int cost = treasure.getCost();
            if (cost == sum) {
                result.add(treasure);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", treasures=" + treasures +
                '}';
    }

}
