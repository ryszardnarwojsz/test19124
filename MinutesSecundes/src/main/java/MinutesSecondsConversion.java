public class MinutesSecondsConversion {

    private static double conversion;

    public static double conversionMinutesIntoSeconds(int minutes){

        conversion = (double) minutes * 60;
        return conversion;
    }

}
