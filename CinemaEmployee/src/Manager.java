public class Manager extends BaseEmployee{

    private static final int MANAGER_BASE_SALARY = 5000;
    private static int BONUS = 500;
    private static final String EMPLOYEE_POSITION = "Manager";

    public Manager(String employeeName, String employeeSurname, int hiredDate) {
       super(employeeName, employeeSurname, EMPLOYEE_POSITION, hiredDate,MANAGER_BASE_SALARY);

    }

    @Override
    public int getBaseSalary(){
        return MANAGER_BASE_SALARY;
     }

    @Override
    public int calculateMonthlySalary() {
        return MANAGER_BASE_SALARY + BONUS;
    }

    public void setBonus(int bonus) {
        Manager.BONUS = bonus;
    }


}
