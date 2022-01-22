public class Bill {


    public static void main(String[] args) {

        BillCalculator newBill = new BillCalculator();

        System.out.println(newBill.calculate(20,1));
        System.out.println(newBill.calculate(20,1,0.05));
        System.out.println(newBill.calculate(20,1,(short) 2));


    }
}
