import java.time.Month;

public class YearSeason {

    private static Seasons yearSeason;

    public static Seasons seasonCheck(Month newMonth) {

        switch (newMonth) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                yearSeason = Seasons.WINTER;
                break;
            case MARCH:
            case APRIL:
            case MAY:
                yearSeason = Seasons.SPRING;
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                yearSeason = Seasons.SUMMER;
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                yearSeason = Seasons.AUTUMN;
                break;
            default:
        }
        return yearSeason;
    }
}
