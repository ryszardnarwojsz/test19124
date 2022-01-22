public class BillCalculator {


    public double calculate(double accountValue,float serviceFee){
        return accountValue + serviceFee;
    }

    public double calculate(double accountValue,float serviceFee,double discount){
        return accountValue + serviceFee - discount * accountValue;
    }

    public double calculate(double accountValue,float serviceFee,short takeAwayPackaging){
        return accountValue + serviceFee + takeAwayPackaging;
    }

}
