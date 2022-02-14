package task4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<Treasure> getTreasures(String fileName) {
        List<Treasure> treasures = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String text;
            while ((text = br.readLine()) != null) {
                Treasure treasure = createTreasure(text);
                treasures.add(treasure);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Cannot read data");
        }
        return treasures;
    }

    private Treasure createTreasure(String text) {
        String[] data = text.split(" ");
        int id = Integer.parseInt(data[0]);
        int cost = Integer.parseInt(data[1]);
        return new Treasure(id, cost);
    }
}
