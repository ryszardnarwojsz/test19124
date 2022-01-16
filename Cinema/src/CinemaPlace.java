public class CinemaPlace {

    private int placeNumber;
    private int rawNumber;
    private boolean isOccupied;

    public CinemaPlace(int placeNumber, int rawNumber) {
        this.placeNumber = placeNumber;
        this.rawNumber = rawNumber;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public int getRawNumber() {
        return rawNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }


    @Override
    public String toString() {
        return "CinemaPlace{" +
                "placeNumber=" + placeNumber +
                ", rawNumber=" + rawNumber +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
