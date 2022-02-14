package task3;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Day> days = new ArrayList<>();

    public void setDays(List<Day> days) {
        this.days = days;
    }

    public List<Day> getHolidays() {
        List<Day> result = new ArrayList<>();
        for (Day day : days) {
            LocalDate date = day.getDate();
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                result.add(day);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "days=" + days +
                '}';
    }

    public class Day {
        private final LocalDate date;

        public Day(LocalDate date) {
            this.date = date;
        }

        public LocalDate getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "Day{" +
                    "date=" + date +
                    '}';
        }
    }
}

