package task3;
/*
Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.

 */

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        Calendar.Day dayOne = calendar.new Day(LocalDate.of(2022, 2, 26));
        Calendar.Day dayTwo = calendar.new Day(LocalDate.of(2022, 2, 27));
        Calendar.Day dayThree = calendar.new Day(LocalDate.of(2022, 2, 22));

        calendar.setDays(List.of(dayOne, dayTwo, dayThree));

        System.out.println(calendar.getHolidays());
    }
}
