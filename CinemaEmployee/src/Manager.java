public class Manager extends BaseEmployee{

    private static final int MANAGER_BASE_SALARY = 5000;
    private static int DEFAULT_BONUS = 500;
    private int bonus = DEFAULT_BONUS;
    private static final String EMPLOYEE_POSITION = "Manager";

    public Manager(String employeeName, String employeeSurname, int hiredDate) {
       super(employeeName, employeeSurname, EMPLOYEE_POSITION, hiredDate,MANAGER_BASE_SALARY);

    }

    @Override
    public int getBaseSalary(){
        return baseSalary;
     }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary + bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


}
