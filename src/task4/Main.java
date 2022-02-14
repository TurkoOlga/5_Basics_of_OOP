package task4;
/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataReader treasuresReader = new DataReader();
        List<Treasure> treasures = treasuresReader.getTreasures("src/basicsofoop/task4/Treasures");

        Dragon dragon = new Dragon("Dino", 1334, treasures);
        dragon.printTreasures();
        dragon.getMaxCostTreasure();
        dragon.getTreasureByMoneySum(24);
    }
}