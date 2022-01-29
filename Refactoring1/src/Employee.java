
import java.math.BigDecimal;

    public class Employee {

        private final String employeeName;
        private final String employeeSurname;
        private int employeeAge;
        private BigDecimal baseSalary;
        private BigDecimal bonus;

        public Employee(String employeeName, String employeeSurname) {
            this.employeeName = employeeName;
            this.employeeSurname = employeeSurname;
        }

        public Employee(String employeeName, String employeeSurname, int employeeAge) {
            this.employeeName = employeeName;
            this.employeeAge = employeeAge;
            this.employeeSurname = employeeSurname;
        }

        public Employee(String employeeName, String employeeSurname, int employeeAge, BigDecimal baseSalary) {
            this.employeeName = employeeName;
            this.employeeAge = employeeAge;
            this.baseSalary = baseSalary;
            this.employeeSurname = employeeSurname;
        }

        public Employee(String employeeName, int employeeAge, BigDecimal baseSalary, BigDecimal bonus, String employeeSurname) {
            this.employeeName = employeeName;
            this.employeeAge = employeeAge;
            this.baseSalary = baseSalary;
            this.bonus = bonus;
            this.employeeSurname = employeeSurname;
        }


        public String getEmployeeInfo() {
            return "Employee name : " + employeeName + " " + employeeSurname;
        }

        public String getEmployeeDetails() {
            return "Employee details : " + employeeName + " " + employeeSurname + " is " + employeeAge;
        }


        public BigDecimal getTotalSalary() {
            return  baseSalary.add(bonus);
        }

        public BigDecimal getBaseSalary() {
            return baseSalary;
        }

        public BigDecimal getBonus() {
            return bonus;
        }


    }

