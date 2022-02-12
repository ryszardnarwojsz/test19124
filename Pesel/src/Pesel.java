public class Pesel {


    public boolean PeselCheck(String pesel){

        for (char c : pesel.toCharArray()) {
            if (!Character.isDigit(c)) throw new WrongTypeOfDataException("Wrong type of characters was input as PESEL");
        }
        if (pesel.length() != 11) throw new IllegalLengthException("PESEL should contain 11 digits");

    return true;
    }
}