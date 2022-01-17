public class CinemaEmployee {

    public static void main(String[] args) {

        Manager newManager = new Manager("Jan", "Kowalski",2020);
        TicketSeller newTicketSeller = new TicketSeller("Adam", "Mały",2010);

        System.out.println(newManager.getBaseSalary());
        System.out.println(newTicketSeller.getBaseSalary());

        System.out.println(newManager.getHiredPeriod());
        System.out.println(newTicketSeller.getHiredPeriod());

        System.out.println(newManager.calculateMonthlySalary());
        System.out.println(newTicketSeller.calculateMonthlySalary());

        newManager.setBonus(623);
        System.out.println(newManager.calculateMonthlySalary());




    }
}
