import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GeTDayFromTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        System.out.println(getDay(date));
    }

    private static DayOfWeek getDay(String date) {
        String dateFormat = "MM dd yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate.getDayOfWeek();
    }
}
