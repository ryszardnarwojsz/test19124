public class MovieClass {

    private String movieTitle;
    private String directorName;
    private String directorSurname;
    private int movieTimeMinutes;
    private int movieYear;


    public MovieClass(String movieTitle, String directorName, String directorSurname, int movieTimeMinutes, int movieYear) {
        this.movieTitle = movieTitle;
        this.directorName = directorName;
        this.directorSurname = directorSurname;
        this.movieTimeMinutes = movieTimeMinutes;
        this.movieYear = movieYear;
    }


    public String getMovieTitle() {
        return movieTitle;
    }

    public String getDirectorName() {
        return directorName;
    }

    public String getDirectorSurname() {
        return directorSurname;
    }

    public int getMovieTimeMinutes() {
        return movieTimeMinutes;
    }

    public int getMovieYear() {
        return movieYear;
    }

    @Override
    public String toString() {
        return "MovieClass{" +
                "movieTitle='" + movieTitle + '\'' +
                ", directorName='" + directorName + '\'' +
                ", directorSurname='" + directorSurname + '\'' +
                ", movieTimeMinutes=" + movieTimeMinutes +
                ", movieYear=" + movieYear +
                '}';
    }
}
