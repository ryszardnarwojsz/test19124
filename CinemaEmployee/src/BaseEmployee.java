import java.time.LocalDate;
import java.time.Year;

public abstract class BaseEmployee {

    private String employeeName;
    private String employeeSurname;
    protected String position;
    private int hiredDate;
    private int hiredPeriod;
    protected int baseSalary;


    public BaseEmployee(String employeeName, String employeeSurname, String position, int hiredDate) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.position = position;
        this.hiredDate = hiredDate;
        this.baseSalary = 3000;
    }

    public BaseEmployee(String employeeName, String employeeSurname, String position, int hiredDate, final int salary) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.position = position;
        this.hiredDate = hiredDate;
        this.baseSalary = salary;
    }



    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public String getPosition() {
        return position;
    }

    public int getHiredDate() {
        return hiredDate;
    }

    public int getHiredPeriod() {
            LocalDate now = LocalDate.now();
            int currentYear = now.getYear();
            hiredPeriod =  currentYear - hiredDate;
        return hiredPeriod;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public abstract int calculateMonthlySalary();

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeSurname='" + employeeSurname + '\'' +
                ", position='" + position + '\'' +
                ", hiredDate=" + hiredDate +
                ", hiredPeriod=" + hiredPeriod +
                ", baseSalary=" + baseSalary +
                '}';
    }

}

