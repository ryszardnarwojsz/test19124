public class TicketSeller extends BaseEmployee{

    private static final String employeePosition = "TicketSeller";

    public TicketSeller(String employeeName, String employeeSurname, int hiredDate) {
        super(employeeName, employeeSurname,employeePosition, hiredDate);
    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary;
    }
}
