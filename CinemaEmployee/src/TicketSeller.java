public class TicketSeller extends BaseEmployee{

    private static final String EMPLOYEE_POSITION = "TicketSeller";

    public TicketSeller(String employeeName, String employeeSurname, int hiredDate) {
        super(employeeName, employeeSurname,EMPLOYEE_POSITION, hiredDate);
    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary;
    }
}
