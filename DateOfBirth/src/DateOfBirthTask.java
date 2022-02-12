import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class DateOfBirthTask {

    public static void main(String[] args) {

        String dateOfBirth;
        dateOfBirth = "1984-08-14";

        LocalDate parseDateOfBirth = LocalDate.parse(dateOfBirth);
        Period newPeriod = Period.between(parseDateOfBirth, LocalDate.now());

        System.out.println("Person is " + newPeriod.getYears() + " years old");
        System.out.println("Person was born on " + parseDateOfBirth.getDayOfWeek());
        System.out.println("Person was born in week: " + parseDateOfBirth.get(ChronoField.ALIGNED_WEEK_OF_YEAR));

    }
}
