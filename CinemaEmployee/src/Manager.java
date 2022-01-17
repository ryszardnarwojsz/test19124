public class Manager extends BaseEmployee{

    private static final int baseSalary = 5000;
    private static int bonus = 500;
    private static final String employeePosition = "Manager";

    public Manager(String employeeName, String employeeSurname, int hiredDate) {
       super(employeeName, employeeSurname, employeePosition, hiredDate);

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
        Manager.bonus = bonus;
    }


}
